package methods;

import java.util.Scanner;

public class NumberCheckerEctra {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isNeon(int n) {
        int sq = n * n, s = 0;
        while (sq > 0) {
            s += sq % 10;
            sq /= 10;
        }
        return s == n;
    }

    static boolean isSpy(int n) {
        int s = 0, p = 1, t = Math.abs(n);
        if (t == 0) { s = 0; p = 0; }
        while (t > 0) {
            int d = t % 10;
            s += d;
            p *= d;
            t /= 10;
        }
        return s == p;
    }

    static boolean isAutomorphic(int n) {
        int sq = n * n, t = n;
        while (t > 0) {
            if (t % 10 != sq % 10) return false;
            t /= 10;
            sq /= 10;
        }
        return true;
    }

    static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Prime       : " + (isPrime(num)       ? "Yes" : "No"));
        System.out.println("Neon        : " + (isNeon(num)        ? "Yes" : "No"));
        System.out.println("Spy         : " + (isSpy(num)         ? "Yes" : "No"));
        System.out.println("Automorphic : " + (isAutomorphic(num) ? "Yes" : "No"));
        System.out.println("Buzz        : " + (isBuzz(num)        ? "Yes" : "No"));
    }
}
