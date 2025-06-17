package array;

import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int[] factors = new int[max];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == max) {
                    max *= 2;
                    int[] temp = new int[max];
                    System.arraycopy(factors, 0, temp, 0, idx);
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }

        for (int i = 0; i < idx; i++)
            System.out.print(factors[i] + (i < idx - 1 ? " " : ""));
    }
}
