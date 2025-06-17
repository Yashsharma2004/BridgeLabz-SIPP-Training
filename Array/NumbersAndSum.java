package array;

import java.util.Scanner;

public class NumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vals = new double[10];
        int idx = 0;
        while (true) {
            double x = sc.nextDouble();
            if (x <= 0 || idx == 10) break;
            vals[idx++] = x;
        }
        double sum = 0;
        for (int i = 0; i < idx; i++) {
            System.out.print(vals[i] + " ");
            sum += vals[i];
        }
        System.out.println("\nSum = " + sum);
    }
}

