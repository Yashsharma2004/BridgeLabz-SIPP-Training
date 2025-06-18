package methods;
import java.util.*;
public class SimpleInterest {
	
	public static double calculateSI(double principle,double rate,double time) {
		return principle*rate*time/100.0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double p=sc.nextDouble();
		System.out.println("Enter the Rate of interest:");
		double r=sc.nextDouble();
		System.out.println("Enter the Years:");
		double t=sc.nextDouble();
		sc.close();
		
		double SI=calculateSI(p,r,t);
		System.out.printf("The Simple Interest is %.2f for principal %.2f,Rate of Interest %.2f and time %.2f years",SI,p,r,t);
		
	}

}
