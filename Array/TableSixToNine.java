package array;

import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] results = new int[4];
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) results[i - 6] = number * i;
        for (int i = 0; i < results.length; i++)
            System.out.println(number + " * " + (i + 6) + " = " + results[i]);
    }
}
