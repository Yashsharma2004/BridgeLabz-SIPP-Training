package methods;

import java.util.Scanner;

public class SimpleCalender {

    static final String[] MONTHS = {
        "January","February","March","April","May","June",
        "July","August","September","October","November","December"
    };

    static int daysInMonth(int m, int y) {
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return d[m - 1];
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static int firstDayOfMonth(int m, int y) {
        int q = 1;
        int mm = m, yy = y;
        if (mm == 1) { mm = 13; yy--; }
        if (mm == 2) { mm = 14; yy--; }
        int k = yy % 100;
        int j = yy / 100;
        int h = (q + (13 * (mm + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int first = firstDayOfMonth(m, y);
        int days  = daysInMonth(m, y);

        System.out.printf("%n     %s %d%n", MONTHS[m - 1], y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < first; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
