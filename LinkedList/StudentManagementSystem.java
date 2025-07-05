class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    void addAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    void addAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    void addAtPosition(Student newStudent, int position) {
        if (position <= 1 || head == null) {
            addAtBeginning(newStudent);
            return;
        }
        Student temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteByRollNumber(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    boolean updateGrade(int rollNumber, char newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            return true;
        }
        return false;
    }

    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(new Student(1, "Alice", 20, 'A'));
        list.addAtEnd(new Student(2, "Bob", 21, 'B'));
        list.addAtPosition(new Student(3, "Charlie", 22, 'C'), 2);

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nUpdating grade for Roll No 2:");
        list.updateGrade(2, 'A');
        list.displayAll();

        System.out.println("\nDeleting Roll No 1:");
        list.deleteByRollNumber(1);
        list.displayAll();
    }
}