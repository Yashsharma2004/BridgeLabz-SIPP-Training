package array;

import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], yrs = new double[10], bonus = new double[10], newSal = new double[10];
        int i = 0;
        while (i < 10) {
            double s = sc.nextDouble(), y = sc.nextDouble();
            if (s <= 0 || y < 0) { System.out.println("Invalid, re‑enter"); continue; }
            salary[i] = s;
            yrs[i] = y;
            i++;
        }
        double totBonus = 0, totOld = 0, totNew = 0;
        for (i = 0; i < 10; i++) {
            bonus[i] = salary[i] * (yrs[i] > 5 ? 0.05 : 0.02);
            newSal[i] = salary[i] + bonus[i];
            totBonus += bonus[i];
            totOld += salary[i];
            totNew += newSal[i];
        }
        System.out.printf("Total old salary = %.2f%nTotal new salary = %.2f%nTotal bonus payout = %.2f%n",
                          totOld, totNew, totBonus);
    }
}

