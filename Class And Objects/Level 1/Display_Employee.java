package class_and_obj;

import java.util.*;

class Employee{
	String name;
	int id;
	double salary;
	Employee(String name, int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

public class Display_Employee{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		double salary=sc.nextDouble();
		
		Employee e= new Employee(name,id,salary);
		e.display();
		
		sc.close();
	}
}