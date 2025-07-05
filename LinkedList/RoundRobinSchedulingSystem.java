class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    Process tail = null;

    void addProcess(Process newProcess) {
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    void removeProcess(int processId) {
        if (head == null) return;
        if (head == tail && head.processId == processId) {
            head = tail = null;
            return;
        }
        Process current = head;
        Process prev = tail;
        do {
            if (current.processId == processId) {
                prev.next = current.next;
                if (current == head) head = current.next;
                if (current == tail) tail = prev;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    void simulateRoundRobin(int timeQuantum) {
        if (head == null) return;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int count = 0;
        boolean done;
        Process current = head;

        do {
            done = true;
            Process temp = current;
            do {
                if (temp.burstTime > 0) {
                    done = false;
                    int execTime = Math.min(temp.burstTime, timeQuantum);
                    System.out.println("Process ID: " + temp.processId + " executed for: " + execTime);
                    temp.burstTime -= execTime;
                    if (temp.burstTime == 0) {
                        int turnAroundTime = execTime + totalWaitingTime;
                        totalTurnAroundTime += turnAroundTime;
                        totalWaitingTime += turnAroundTime - execTime;
                        count++;
                    }
                }
                temp = temp.next;
            } while (temp != current);
        } while (!done);

        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnAroundTime = (double) totalTurnAroundTime / count;
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnAroundTime);
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinSchedulingSystem {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(new Process(1, 10, 1));
        scheduler.addProcess(new Process(2, 5, 2));
        scheduler.addProcess(new Process(3, 8, 1));

        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        System.out.println("\nSimulating Round Robin Scheduling with Time Quantum = 4:");
        scheduler.simulateRoundRobin(4);

        System.out.println("\nFinal Process List:");
        scheduler.displayProcesses();
    }
}
