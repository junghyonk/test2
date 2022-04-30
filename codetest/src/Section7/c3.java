package Section7;

import java.util.Scanner;

public class c3 {
	static int sum=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int k=key.nextInt();
		
		recur(k);
		System.out.println(sum);
	}

	private static void recur(int n) {
		if(n==0) {
			return;
		}
		else {
			recur(n-1);
			sum*=n;
		}
	}

}
