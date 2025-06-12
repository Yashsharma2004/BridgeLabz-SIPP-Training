package com.operators;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter integer b: ");
        int b = sc.nextInt();

        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;     // Multiplication has higher precedence than addition
        int result2 = a * b + c;     // Multiplication first, then addition
        int result3 = c + a / b;     // Division before addition
        int result4 = a % b + c;     // Modulus before addition

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
        System.out.println("Extra: The result of a % b + c is " + result4);
    }
}
