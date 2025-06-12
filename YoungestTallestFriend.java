package controlflow;
import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        
        int minAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        
        int maxHeight = heightAmar;
        String tallest = "Amar";
        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        System.out.println("\nYoungest friend: " + youngest + " (" + minAge + " years)");
        System.out.println("Tallest friend: " + tallest + " (" + maxHeight + " cm)");
        sc.close();
    }
   
}

