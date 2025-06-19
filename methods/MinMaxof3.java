package methods;

import java.util.*;
import java.util.Arrays;

public class MinMaxof3 {
	
	public static int[] findminandmax(int number1,int number2,int number3) {
		int[] arr= {number1,number2,number3};
		Arrays.sort(arr);
		return new int[] {arr[0],arr[2]};
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int n1= sc.nextInt();
		System.out.println("Enter Second Number:");
		int n2=sc.nextInt();
		System.out.println("Enter third Number:");
		int n3=sc.nextInt();
		sc.close();
		
		int[] result=findminandmax(n1,n2,n3);
		System.out.printf("the Smallest number is %d and the largest number is %d.%n",result[0],result[1]);
	}
}
