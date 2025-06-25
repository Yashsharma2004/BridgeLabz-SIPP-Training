package oops.keywords;

class Students {
    static String universityName = "XYZ University";
    static int totalStudents = 0;
    final int rollNumber;
    String name, grade;

    Students(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        if (this instanceof Students) {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
            
        }
    }
}

