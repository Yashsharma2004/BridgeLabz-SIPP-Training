package array;

import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] ht = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) { age[i] = sc.nextInt(); ht[i] = sc.nextDouble(); }
        int yIdx = 0, tIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[yIdx]) yIdx = i;
            if (ht[i] > ht[tIdx]) tIdx = i;
        }
        System.out.println("Youngest: " + name[yIdx]);
        System.out.println("Tallest : " + name[tIdx]);
    }
}
