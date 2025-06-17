package array;

import java.util.*;
public class Grades1D {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		double[] perc= new double[n];
		char[] grade= new char[n];
		int[][] marks= new int[n][3];
		for(int i=0;i<n;i++) {
			int p=sc.nextInt(),c=sc.nextInt(),m=sc.nextInt();
			if(p<0 || c<0 || m<0) {
				System.out.println("Positive only");
				i--;
				continue;
			}
			marks[i][0]=p;
			marks[i][1]=c;
			marks[i][2]=m;
			perc[i]=(p+c+m)/3.0;
			grade[i]=perc[i]>=90 ? 'A' : perc[i]>=80 ? 'B' : perc[i] >=70 ? 'C':
				perc[i]>=60 ?'D' : 'F';
		}
		for(int i=0;i<n;i++)
			System.out.printf("P=%d C=%d M=%d -> %02f%% Grade=%c%n",
					marks[i][0],marks[i][1],marks[i][2],perc[i],grade[i]);
	}

}
