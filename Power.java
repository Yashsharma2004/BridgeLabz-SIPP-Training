package controlflow;

import java.util.*;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		int power=sc.nextInt();
		
		int result=1;
		int counter=0;
		
		while(counter<power) {
			result *= number;
			counter++;
		}
		 
        System.out.println(number + " raised to the power " + power + " is: " + result);
		// TODO Auto-generated method stub
        sc.close();

	}
	
}
