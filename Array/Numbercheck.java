package array;

import java.util.*;

public class Numbercheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [] arr= new int[5];
		
		System.out.println("Enter 5 numbers:");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int n :arr) {
			if(n>0) {
				if(n%2==0) {
					System.out.println(n+"is positive and even");
				}else {
					System.out.println(n+"is positive and odd");
				}
			}else if(n<0) {
				System.out.println(n+"is negative");
				
			}else {
				System.out.println(n+"is zero");
			}
		}
		
		int first=arr[0];
		int last=arr[arr.length-1];
		if(first==last) {
			System.out.println("first and last elemenst are equal");
			
		}else if(first>last) {
			System.out.println("first element is greater than the last");
		}else {
			System.out.println("first element is less than last");
			
		}
		sc.close();
	}

}
