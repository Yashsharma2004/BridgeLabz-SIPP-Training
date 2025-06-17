package array;

import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] wt = new double[n], ht = new double[n], bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble(), h = sc.nextDouble();
            if (w <= 0 || h <= 0) { System.out.println("Re‑enter"); i--; continue; }
            wt[i] = w; ht[i] = h;
            bmi[i] = w / (h * h);
            status[i] = bmi[i] < 18.5 ? "Underweight" :
                        bmi[i] < 25   ? "Normal" :
                        bmi[i] < 30   ? "Overweight" : "Obese";
        }
        for (int i = 0; i < n; i++)
            System.out.printf("H=%.2f W=%.2f BMI=%.2f %s%n", ht[i], wt[i], bmi[i], status[i]);
    }
}
