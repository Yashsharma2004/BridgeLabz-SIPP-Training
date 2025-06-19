package methods;

import java.util.Scanner;

public class MatrixOperations {

    static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = 1 + (int) (Math.random() * 9);
        return m;
    }

    static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        return t;
    }

    static int det2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int det3(int[][] m) {
        int a = m[0][0], b = m[0][1], c = m[0][2];
        int d = m[1][0], e = m[1][1], f = m[1][2];
        int g = m[2][0], h = m[2][1], i = m[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    static double[][] inverse3(int[][] m) {
        int det = det3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / (double) det;
        inv[0][2] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / (double) det;
        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / (double) det;
        inv[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / (double) det;
        inv[2][0] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / (double) det;
        inv[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / (double) det;
        return inv;
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }

    static void display(double[][] m) {
        for (double[] row : m) {
            for (double v : row) System.out.printf("%8.3f", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[][] mat = randomMatrix(r, c);
        System.out.println("Original:");
        display(mat);

        System.out.println("Transpose:");
        display(transpose(mat));

        if (r == 2 && c == 2) {
            System.out.println("Determinant: " + det2(mat));
        } else if (r == 3 && c == 3) {
            int det = det3(mat);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse3(mat);
            if (inv == null) System.out.println("Inverse: Not invertible");
            else {
                System.out.println("Inverse:");
                display(inv);
            }
        }
    }
}
