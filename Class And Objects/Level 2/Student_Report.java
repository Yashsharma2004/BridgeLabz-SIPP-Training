package class_and_obj;

import java.util.*;
class Student{
    String name;
    int roll;
    int marks;
    Student(String n,int r,int m){
        name=n;roll=r;marks=m;
    }
    char grade(){
        if(marks>=90)return 'A';
        else if(marks>=75)return 'B';
        else if(marks>=60)return 'C';
        else if(marks>=50)return 'D';
        else return 'F';
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade());
    }
}
public class Student_Report{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        int marks=sc.nextInt();
        Student s=new Student(name,roll,marks);
        s.display();
    }
}
