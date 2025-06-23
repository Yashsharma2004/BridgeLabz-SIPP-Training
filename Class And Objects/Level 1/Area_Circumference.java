package class_and_obj;

import java.util.*;
class Circle{
    double radius;
    Circle(double r){radius=r;}
    double area(){return Math.PI*radius*radius;}
    double circumference(){return 2*Math.PI*radius;}
    void display(){
        System.out.printf("Area: %.2f%n",area());
        System.out.printf("Circumference: %.2f%n",circumference());
    }
}


public class Area_Circumference {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        Circle c=new Circle(r);
        c.display();
		// TODO Auto-generated method stub

	}

}
