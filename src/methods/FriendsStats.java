package methods;

import java.util.Scanner;

public class FriendsStats {

    private static final String[] NAMES = {"Amar", "Akbar", "Anthony"};

    
    public static int youngest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[idx]) idx = i;
        return idx;
    }

    
    public static int tallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]    ages    = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter %s's age: ", NAMES[i]);
            ages[i] = sc.nextInt();
            System.out.printf("Enter %s's height (cm): ", NAMES[i]);
            heights[i] = sc.nextDouble();
        }
        sc.close();

        System.out.printf("Youngest: %s%n", NAMES[youngest(ages)]);
        System.out.printf("Tallest : %s%n", NAMES[tallest(heights)]);
    }
}
