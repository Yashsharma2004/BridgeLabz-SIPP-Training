package com.operators;

import java.util.Scanner;

public class Basic_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double division = number1 / number2;

        System.out.println("Addition is " + sum + ", Subtraction is " + diff + ", Multiplication is " + product + ", Division is " + division);
    }
}

