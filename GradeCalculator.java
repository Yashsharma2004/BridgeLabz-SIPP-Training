package controlflow;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + average);
        if (average >= 90) System.out.println("Grade: A+ | Remark: Excellent");
        else if (average >= 80) System.out.println("Grade: A | Remark: Very Good");
        else if (average >= 70) System.out.println("Grade: B | Remark: Good");
        else if (average >= 60) System.out.println("Grade: C | Remark: Satisfactory");
        else if (average >= 50) System.out.println("Grade: D | Remark: Needs Improvement");
        else System.out.println("Grade: F | Remark: Fail");
    }
}
