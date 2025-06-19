package methods;

import java.util.Scanner;

public class NumberCheckerDivisor {

    static int sumProperDivisors(int n) {
        if (n <= 1) return 0;
        int s = 1;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) {
                s += i;
                int p = n / i;
                if (p != i) s += p;
            }
        return s;
    }

    static boolean isPerfect(int n)    { return n > 0 && sumProperDivisors(n) == n; }
    static boolean isAbundant(int n)   { return n > 0 && sumProperDivisors(n) > n; }
    static boolean isDeficient(int n)  { return n > 0 && sumProperDivisors(n) < n; }

    static int factorial(int d) {
        int f = 1;
        for (int i = 2; i <= d; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int t = Math.abs(n), s = 0;
        if (t == 0) s = factorial(0);
        while (t > 0) {
            s += factorial(t % 10);
            t /= 10;
        }
        return s == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Perfect number : " + (isPerfect(num)   ? "Yes" : "No"));
        System.out.println("Abundant number: " + (isAbundant(num)  ? "Yes" : "No"));
        System.out.println("Deficient number: " + (isDeficient(num) ? "Yes" : "No"));
        System.out.println("Strong number  : " + (isStrong(num)    ? "Yes" : "No"));
    }
}

