package builtin_functions;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        while (low <= high) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            String reply = sc.nextLine().trim().toLowerCase();
            if (reply.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (reply.equals("higher")) {
                low = guess + 1;
            } else if (reply.equals("lower")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid response");
            }
        }
    }
}

