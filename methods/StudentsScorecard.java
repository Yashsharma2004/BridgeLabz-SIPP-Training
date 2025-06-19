package methods;

import java.util.Scanner;

public class StudentsScorecard {

    static int[][] randomScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = 30 + (int) (Math.random() * 71);
        return s;
    }

    static double[][] computeStats(int[][] m) {
        int n = m.length;
        double[][] res = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = m[i][0] + m[i][1] + m[i][2];
            double avg = total / 3.0;
            double pct = total / 300.0 * 100;
            res[i][0] = Math.round(total * 100) / 100.0;
            res[i][1] = Math.round(avg   * 100) / 100.0;
            res[i][2] = Math.round(pct   * 100) / 100.0;
        }
        return res;
    }

    static void display(int[][] marks, double[][] stats) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t% ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1));
            for (int j = 0; j < 3; j++) System.out.print("\t" + marks[i][j]);
            for (int j = 0; j < 3; j++) System.out.print("\t" + stats[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] marks = randomScores(n);
        double[][] stats = computeStats(marks);
        display(marks, stats);
    }
}

