package array;

import java.util.Scanner;

public class Grades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mk = new int[n][3];
        double[] perc = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) { System.out.println("Positive only"); i--; continue; }
            mk[i][0] = p; mk[i][1] = c; mk[i][2] = m;
            perc[i] = (p + c + m) / 3.0;
            grade[i] = perc[i] >= 90 ? 'A' : perc[i] >= 80 ? 'B' :
                       perc[i] >= 70 ? 'C' : perc[i] >= 60 ? 'D' : 'F';
        }
        for (int i = 0; i < n; i++)
            System.out.printf("%d %d %d -> %.2f%% %c%n",
                              mk[i][0], mk[i][1], mk[i][2], perc[i], grade[i]);
    }
}

