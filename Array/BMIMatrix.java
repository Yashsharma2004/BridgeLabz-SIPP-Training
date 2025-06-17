package array;

import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] person = new double[n][3]; // w,h,bmi
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble(), h = sc.nextDouble();
            if (w <= 0 || h <= 0) { System.out.println("Re‑enter"); i--; continue; }
            person[i][0] = w; person[i][1] = h;
            person[i][2] = w / (h * h);
            status[i] = person[i][2] < 18.5 ? "Underweight" :
                        person[i][2] < 25   ? "Normal" :
                        person[i][2] < 30   ? "Overweight" : "Obese";
        }
        for (int i = 0; i < n; i++)
            System.out.printf("H=%.2f W=%.2f BMI=%.2f %s%n",
                              person[i][1], person[i][0], person[i][2], status[i]);
    }
}
