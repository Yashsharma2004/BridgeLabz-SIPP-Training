package com.operators;

import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (in cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        double areaInCm = 0.5 * base * height;
        double areaInInch = areaInCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaInCm + " and sq in is " + areaInInch);
    }
}
