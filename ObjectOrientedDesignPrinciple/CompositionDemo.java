package oops.principles;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String name;
    List<Department> departments;

    Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Ravi"));
        d1.addEmployee(new Employee("Sita"));

        d2.addEmployee(new Employee("Karan"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showStructure();

        c = null; // Implies company deleted -> deallocates departments and employees
    }
}

