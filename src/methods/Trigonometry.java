package methods;
import java.util.*;

public class Trigonometry {
	public static double[] calculateTrigonometric(double angle) {
		double radians=Math.toRadians(angle);
		return new double[] {
				Math.sin(radians),
				Math.cos(radians),
				Math.tan(radians)
		};
	}
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter angle in degree:");
		double angle=sc.nextDouble();
		sc.close();
	
	double[] trig= calculateTrigonometric(angle);
	System.out.printf("sin(%.2f)=%.6f%n",angle,trig[0]);
	System.out.printf("cos(%.2f)=%.6f%n",angle,trig[1]);
	System.out.printf("tan(%.2f)=%.6f%n",angle,trig[2]);
	}
}
	

