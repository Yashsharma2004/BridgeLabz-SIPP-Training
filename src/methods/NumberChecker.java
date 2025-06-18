package methods;

import java.util.Arrays;

public final class NumberChecker {

    private NumberChecker() {}

    
    public static int countDigits(long n) {
        return Long.toString(Math.abs(n)).length();
    }

    
    public static int[] toDigits(long n) {
        String s = Long.toString(Math.abs(n));
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    
    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    
    public static boolean areEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    
    public static boolean isPalindrome(long n) {
        int[] d = toDigits(n);
        return areEqual(d, reverse(d));
    }

    
    public static boolean isDuckNumber(long n) {
        String s = Long.toString(Math.abs(n));
        return s.indexOf('0') > 0;               
    }

   
    public static void main(String[] args) {
        long num = 10501;

        System.out.println("Digits        : " + Arrays.toString(toDigits(num)));
        System.out.println("Reversed      : " + Arrays.toString(reverse(toDigits(num))));
        System.out.println("Palindrome?   : " + isPalindrome(num));
        System.out.println("Duck number?  : " + isDuckNumber(num));
        System.out.println("#Digits       : " + countDigits(num));
    }
}

