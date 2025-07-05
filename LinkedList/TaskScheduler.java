class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularLinkedList {
    Task head = null;
    Task tail = null;
    Task current = null;

    void addAtEnd(Task newTask) {
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    void addAtBeginning(Task newTask) {
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    void addAtPosition(Task newTask, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newTask);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
    }

    void removeByTaskId(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next.taskId == taskId) {
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }
    }

    Task viewCurrentTask() {
        if (current == null) current = head;
        return current;
    }

    void moveToNextTask() {
        if (current != null) {
            current = current.next;
        }
    }

    void displayAll() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    Task searchByPriority(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularLinkedList list = new TaskCircularLinkedList();

        list.addAtEnd(new Task(101, "Write Report", 1, "2025-07-06"));
        list.addAtBeginning(new Task(102, "Review Code", 2, "2025-07-07"));
        list.addAtPosition(new Task(103, "Team Meeting", 3, "2025-07-08"), 2);

        System.out.println("All Tasks:");
        list.displayAll();

        System.out.println("\nCurrent Task:");
        Task current = list.viewCurrentTask();
        System.out.println(current.taskName);

        System.out.println("\nMoving to Next Task:");
        list.moveToNextTask();
        System.out.println(list.viewCurrentTask().taskName);

        System.out.println("\nSearching for Priority 2:");
        Task found = list.searchByPriority(2);
        if (found != null) {
            System.out.println(found.taskName);
        }

        System.out.println("\nRemoving Task ID 101:");
        list.removeByTaskId(101);
        list.displayAll();
    }
}
