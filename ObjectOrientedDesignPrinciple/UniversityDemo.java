package oops.principles;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    List<Department> departments;
    List<Faculty> faculties;

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showStructure() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.show();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.show();
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University u = new University("Global University");

        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        Faculty f1 = new Faculty("Dr. Meera");
        Faculty f2 = new Faculty("Dr. Singh");

        u.addDepartment(cs);
        u.addDepartment(ee);
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showStructure();

        u = null; // Deleting university -> Departments gone, Faculties remain (aggregation)
    }
}

