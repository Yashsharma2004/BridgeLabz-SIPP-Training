package array;
import java.util.*;
public class OddEvenArrays {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number=sc.nextInt();
		if(number<=0) {
			System.out.println("enter valid number");
			return;
		}
		
		int size=number/2 +1;
		int[] odd= new int[size];
		int[] even=new int[size];
		int oddIdx=0,evenIdx=0;
		// TODO Auto-generated method stub
		for(int i =1;i<=number;i++) {
			if(i%2==0) {
				even[evenIdx++]=i;
			}else {
				odd[oddIdx++]=i;
			}
		}
		
		System.out.println("odd numbers:");
		for(int i=0;i<oddIdx;i++) {
			System.out.println(odd[i]+" ");
		}
		System.out.println("even numbers:");
		for(int i =0;i<evenIdx;i++){
			System.out.println(even[i]+" ");
		}
		sc.close();
	}

}
