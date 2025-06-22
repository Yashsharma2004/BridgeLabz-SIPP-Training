package builtin_functions;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        sc.nextLine();
        String type = sc.nextLine().trim().toUpperCase();
        if (type.equals("F")) {
            double c = (value - 32) * 5 / 9;
            System.out.println(c);
        } else if (type.equals("C")) {
            double f = value * 9 / 5 + 32;
            System.out.println(f);
        } else {
            System.out.println("Invalid type");
        }
    }
}
