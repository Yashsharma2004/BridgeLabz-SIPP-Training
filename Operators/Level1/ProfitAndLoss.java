package com.operators;

public class ProfitAndLoss {

	public static void main(String[] args) {
		int cost_price=129;
		int selling_price=191;
		
		int profit= selling_price - cost_price;
		double percentage = (profit * 100.0) / cost_price ;

		        System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price);
		        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + percentage);
		    }
		}


