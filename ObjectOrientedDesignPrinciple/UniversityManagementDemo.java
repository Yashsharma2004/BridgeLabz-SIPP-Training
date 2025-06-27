package oops.principles;

import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.courseName);
    }
}

class Course {
    String courseName;
    Professor professor;
    List<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student s) {
        enrolledStudents.add(s);
        s.enrollCourse(this);
    }

    void setProfessor(Professor p) {
        this.professor = p;
    }

    void showDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
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

    void enrollCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
    }

    void viewCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Isha");
        Student s2 = new Student("Dev");

        Professor prof = new Professor("Dr. Rakesh");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        prof.assignCourse(c1);

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s2);

        s1.viewCourses();
        s2.viewCourses();

        c1.showDetails();
        c2.showDetails();
    }
}
