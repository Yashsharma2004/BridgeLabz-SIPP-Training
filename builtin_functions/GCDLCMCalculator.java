package builtin_functions;

import java.util.Scanner;

public class GCDLCMCalculator {
    private static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long g = gcd(a, b);
        long l = a / g * b;
        System.out.println("GCD: " + g);
        System.out.println("LCM: " + l);
    }
}

