package methods;

import java.util.Scanner;

public class MatrixArithmetic {

    static int[][] randomMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = 1 + (int) (Math.random() * 9);
        return m;
    }

    static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] s = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                s[i][j] = a[i][j] + b[i][j];
        return s;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] d = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                d[i][j] = a[i][j] - b[i][j];
        return d;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, k = b.length;
        int[][] p = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int t = 0; t < k; t++) sum += a[i][t] * b[t][j];
                p[i][j] = sum;
            }
        return p;
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int v : row) System.out.printf("%4d", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        sc.close();

        int[][] A = randomMatrix(r1, c1);
        int[][] B = randomMatrix(r2, c2);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("A + B:");
            display(add(A, B));
            System.out.println("A - B:");
            display(subtract(A, B));
        } else System.out.println("Addition/Subtraction not possible");

        if (c1 == r2) {
            System.out.println("A × B:");
            display(multiply(A, B));
        } else System.out.println("Multiplication not possible");
    }
}
