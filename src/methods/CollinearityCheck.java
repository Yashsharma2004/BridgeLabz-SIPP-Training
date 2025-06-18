package methods;

import java.util.Scanner;

public class CollinearityCheck {

    static boolean isCollinearSlope(double x1, double y1,
                                    double x2, double y2,
                                    double x3, double y3) {
        double dx1 = x2 - x1, dy1 = y2 - y1;
        double dx2 = x3 - x2, dy2 = y3 - y2;
        return Math.abs(dy1 * dx2 - dy2 * dx1) < 1e-9;
    }

    static boolean isCollinearArea(double x1, double y1,
                                   double x2, double y2,
                                   double x3, double y3) {
        double area2 = x1 * (y2 - y3)
                     + x2 * (y3 - y1)
                     + x3 * (y1 - y2);
        return Math.abs(area2) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double x3 = sc.nextDouble(), y3 = sc.nextDouble();
        sc.close();

        System.out.println("Slope method : "
                + (isCollinearSlope(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not collinear"));
        System.out.println("Area method  : "
                + (isCollinearArea(x1, y1, x2, y2, x3, y3) ? "Collinear" : "Not collinear"));
    }
}

