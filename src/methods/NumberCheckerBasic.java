package methods;

import java.util.Scanner;

public class NumberCheckerBasic {

    static int countDigits(long n) {
        if (n == 0) return 1;
        int c = 0;
        long t = Math.abs(n);
        while (t > 0) {
            c++;
            t /= 10;
        }
        return c;
    }

    static int[] toDigits(long n) {
        int len = countDigits(n);
        int[] d = new int[len];
        long t = Math.abs(n);
        for (int i = len - 1; i >= 0; i--) {
            d[i] = (int) (t % 10);
            t /= 10;
        }
        return d;
    }

    static int sumDigits(int[] d) {
        int s = 0;
        for (int v : d) s += v;
        return s;
    }

    static int sumSquaresDigits(int[] d) {
        int s = 0;
        for (int v : d) s += (int) Math.pow(v, 2);
        return s;
    }

    static boolean isHarshad(long n) {
        int s = sumDigits(toDigits(n));
        return s != 0 && n % s == 0;
    }

    static int[][] digitFrequency(long n) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        long t = Math.abs(n);
        if (t == 0) f[0][1] = 1;
        while (t > 0) {
            int dig = (int) (t % 10);
            f[dig][1]++;
            t /= 10;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();

        int[] digs = toDigits(num);
        System.out.println("Count of digits        : " + digs.length);
        System.out.println("Sum of digits          : " + sumDigits(digs));
        System.out.println("Sum of squares of digits: " + sumSquaresDigits(digs));
        System.out.println("Harshad number         : " + (isHarshad(num) ? "Yes" : "No"));
        int[][] freq = digitFrequency(num);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < freq.length; i++)
            if (freq[i][1] > 0) System.out.println(freq[i][0] + " -> " + freq[i][1]);
    }
}
