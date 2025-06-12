package com.operators;

public class Volume {

	public static void main(String[] args) {
		int radius = 6378;
		double volumekm3 =(4.0/3.0)* Math.PI * Math.pow(radius, 3);
		double km3toMiles3= 0.2399128;
		double volumeM3= volumekm3*km3toMiles3;
		System.out.println("the volume of earth in km3 is " + volumekm3);
		System.out.println("the volume of earth in m3 is " + volumeM3);
		// TODO Auto-generated method stub

	}

}
