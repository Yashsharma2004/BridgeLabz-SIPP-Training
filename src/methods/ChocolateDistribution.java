package methods;
import java.util.*;

public class ChocolateDistribution {
	public static int[] findRemainderAndQuotient(int number,int divisor) {
		int quotient=number/ divisor;
		int remainder=number % divisor;
		return new int[] {quotient,remainder};
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of chocolates:");
		int numberofChocolates=sc.nextInt();
		System.out.println("Enter number of children:");
		int numberofChildren=sc.nextInt();
		sc.close();
	
	int[] result=findRemainderAndQuotient(numberofChocolates,numberofChildren);
	System.out.printf("Each child gets %d chocolates and %d remains.",
            result[0], result[1]);
	}
}
