package methods;

import java.util.Scanner;

public class OtpValidator {

    public static int generateOtp() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean allUnique(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] codes = new int[10];
        for (int i = 0; i < codes.length; i++) codes[i] = generateOtp();

        System.out.println("Ten generated OTPs:");
        for (int code : codes) System.out.println(code);

        if (allUnique(codes))
            System.out.println("All OTPs are unique.");
        else
            System.out.println("Duplicate OTP detected.");
    }
}


