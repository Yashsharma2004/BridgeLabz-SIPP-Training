package oops.principles;

import java.util.*;

class Course {
    String courseName;
    List<Student> students;

    Course(String name) {
        this.courseName = name;
        this.students = new ArrayList<>();
    }

    void enrollStudent(Student student) {
        students.add(student);
        student.enrollInCourse(this);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

class School {
    String name;
    List<Student> students;

    School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student s1 = new Student("Anjali");
        Student s2 = new Student("Rohan");

        Course math = new Course("Math");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        math.enrollStudent(s1);
        science.enrollStudent(s1);
        science.enrollStudent(s2);

        s1.viewCourses();
        s2.viewCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}

