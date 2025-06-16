package com.operators;
import java.util.*;
public class KmToMiles_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double km = sc.nextDouble();
		double mile = km * 1.6;
		
		System.out.println("the total miles is " + mile + " mile for the given "+km+" km");
		// TODO Auto-generated method stub
		sc.close();

	}

}
