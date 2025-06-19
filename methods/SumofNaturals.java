package methods;

import java.util.Scanner;

public class SumofNaturals {

    
    public static long recursiveSum(long n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    
    public static long formulaSum(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        long n = sc.nextLong();
        sc.close();

        if (n <= 0) {
            System.out.println("n must be a positive integer!");
            return;
        }

        long rec = recursiveSum(n);
        long frm = formulaSum(n);

        System.out.printf("Recursive result : %d%n", rec);
        System.out.printf("Formula result   : %d%n", frm);
        System.out.println(rec == frm
            ? "Both methods match!"
            : "Results differ");
    }
}

