package array;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) age[i] = sc.nextInt();
        for (int a : age) {
            if (a <0) System.out.println("Invalid age");
            else if (a >= 18) System.out.println("The student with age " + a + " can vote");
            else System.out.println("The student with age " + a + " cannot vote");
        }
    }
}
