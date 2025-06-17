package array;
import java.util.*;

public class MultiDimToOneDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] mat= new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		int[] flat= new int[rows*cols];
		int idx=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				flat[idx++]=mat[i][j];
			}
			
		}
		for(int i=0;i<flat.length;i++) {
			System.out.println(flat[i] + (i<flat.length-1 ? " ": ""));
		}
		sc.close();
	}

}
