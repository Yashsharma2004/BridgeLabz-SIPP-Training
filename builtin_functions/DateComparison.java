package builtin_functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate first = LocalDate.parse(sc.nextLine(), df);
        LocalDate second = LocalDate.parse(sc.nextLine(), df);
        if (first.isBefore(second)) {
            System.out.println("First date is before the second date");
        } else if (first.isAfter(second)) {
            System.out.println("First date is after the second date");
        } else {
            System.out.println("Both dates are equal");
        }
    }
}
