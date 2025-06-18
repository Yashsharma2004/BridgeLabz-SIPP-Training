package methods;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySignParity {

     public static boolean isPositive(int n) { return n >= 0; }
     public static boolean isEven(int n)     { return n % 2 == 0; }

    
    public static int compare(int a, int b) {
        return Integer.compare(a, b);             
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        sc.close();

        
        for (int n : nums) {
            if (isPositive(n)) {
                System.out.print(n + " is positive and ");
                System.out.println(isEven(n) ? "even" : "odd");
            } else {
                System.out.println(n + " is negative");
            }
        }

        
        int first = nums[0], last = nums[nums.length - 1];
        int res = compare(first, last);
        if (res == 0)        System.out.println("First and last are equal.");
        else if (res > 0)    System.out.println("First is greater than last.");
        else                 System.out.println("First is less than last.");
    }
}

