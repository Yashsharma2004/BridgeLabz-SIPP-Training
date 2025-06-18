package methods;
import java.util.*;

public class TriangularRun {
	public static double roundsNeeded(double sideA,double sideB,double sideC) {
		double perimeter= sideA+sideB+sideC;
		double distanceToCover=5000.0;
		return distanceToCover/perimeter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side1:");
		double a= sc.nextDouble();
		System.out.println("Enter Side2:");
		double b= sc.nextDouble();
		System.out.println("Enter Side3:");
		double c= sc.nextDouble();
		sc.close();
		
		double rounds=roundsNeeded(a,b,c);
		System.out.printf("The Athelete must run %.2f round to complete 5km.%n",rounds);
		
	}
	

}
