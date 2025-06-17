package array;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] freq = new int[10];
        if (n == 0) freq[0] = 1;
        while (n != 0) {
            freq[(int)(n % 10)]++;
            n /= 10;
        }
        for (int d = 0; d < 10; d++)
            if (freq[d] > 0) System.out.println(d + " -> " + freq[d]);
    }
}
