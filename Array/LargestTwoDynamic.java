package array;

import java.util.Scanner;

public class LargestTwoDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int maxDig = 10, idx = 0;
        int[] dig = new int[maxDig];
        while (n != 0) {
            if (idx == maxDig) {
                maxDig *= 2;
                int[] t = new int[maxDig];
                System.arraycopy(dig, 0, t, 0, idx);
                dig = t;
            }
            dig[idx++] = (int)(n % 10);
            n /= 10;
        }
        int first = -1, second = -1;
        for (int i = 0; i < idx; i++) {
            if (dig[i] > first) { second = first; first = dig[i]; }
            else if (dig[i] > second && dig[i] != first) second = dig[i];
        }
        System.out.println("Largest = " + first + ", Second largest = " + second);
    }
}
