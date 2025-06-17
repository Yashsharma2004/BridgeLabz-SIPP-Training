package array;
import java.util.*;

public class ReverseDigits {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int number= sc.nextInt();
		
		int[] digits=new int[10];
		int index=0;
		
		while(number!=0) {
			int digit=number%10;
			digits[index]=digit;
			index++;
			number=number/10;
	}
		System.out.println("Digits in reverse order:");
		for(int i=0;i<index;i++) {
			System.out.print(digits[i] + " ");
		}
	}
}
