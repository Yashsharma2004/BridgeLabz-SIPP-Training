package methods;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class RandomStats {
	public static int[] generate4DigitRandomArray(int size) {
		int[] arr= new int[size];
		Random r= new Random();
		for(int i=0;i<size;i++) {
			arr[i]=1000+r.nextInt(9000);
		}
		return arr;
	}
	
	public static double[] findAverageMinMax(int[] numbers) {
		int min=numbers[0],max=numbers[0],sum=0;
		for(int n: numbers) {
			sum+=n;
			min=Math.min(min, n);
			max=Math.max(max, n);
		}
		
		double avg= sum/(double)numbers.length;
		return new double[] {avg,min,max};
	}
	
	public static void main(String[] args) {
		int[] rnd= generate4DigitRandomArray(5);
		double[] stats=findAverageMinMax(rnd);
		
		System.out.println("Random 4 Digit numbers:"+Arrays.toString(rnd));
		System.out.printf("Average=%.2f,Min=%.0f,Max=%.0f%n",stats[0],stats[1],stats[2]);
	}

}
