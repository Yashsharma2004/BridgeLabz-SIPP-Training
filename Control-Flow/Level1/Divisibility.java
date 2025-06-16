package controlflow;

import java.util.*;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n = sc.nextInt();
		
		if(n%5==0) {
			System.out.println("is the number "+ n +" divisible  by 5? "+ "Yes");
		}
		else {
			System.out.println("is the number "+ n +" divisible by 5? "+ "NO");
		}
		sc.close();

	}

}
