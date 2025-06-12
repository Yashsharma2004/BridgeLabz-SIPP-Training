package com.operators;

import java.util.*;
public class University_fee_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter fee:");
		int fee = sc.nextInt();
		
		System.out.println("Enter discountPercentage:");
		double discountPercentage = sc.nextDouble();
		
		double discount = fee * (discountPercentage/100.0);
		
		double finalfee= fee - discount;
		
		System.out.println("the discount is" + discount);
		System.out.println("the final fee is " + finalfee);
		sc.close();
		// TODO Auto-generated method stub

	}

}
