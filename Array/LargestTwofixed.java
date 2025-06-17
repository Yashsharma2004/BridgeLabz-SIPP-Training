package array;

import java.util.Scanner;

public class LargestTwofixed {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		int[] dig= new int[10];
		int idx=0;
		while(n!=0 && idx<10) {
			dig[idx++]=(int)(n%10);
			n/=10;
		}
		int first=-1,second=-1;
		for(int i=0;i<idx;i++) {
			if(dig[i]>first) { second =first; first=dig[i];}
			else if(dig[i]>second && dig[i] != first) second=dig[i];
			
		}
		System.out.println("Largest="+first+",second largest="+second);
	}

}
