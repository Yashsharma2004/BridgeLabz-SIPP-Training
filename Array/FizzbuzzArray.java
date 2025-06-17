package array;

import java.util.*;
public class FizzbuzzArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String[] res = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0)
                res[i] = "FizzBuzz";
            else if (i % 3 == 0)
                res[i] = "Fizz";
            else if (i % 5 == 0)
                res[i] = "Buzz";
            else
                res[i] = String.valueOf(i);
        }

        for (int i = 0; i < res.length; i++)
            System.out.println("Position " + i + " = " + res[i]);
		
		
		
	}

}
