package builtin_functions;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.equals(sb.reverse().toString()) ? "Palindrome" : "Not palindrome");
    }
}
