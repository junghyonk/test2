package Section7;

import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int k=key.nextInt();
		recur(k);
	}

	private static void recur(int n) {
		if(n==0) {
			return;
		}else {
			recur(n/2);
			System.out.print(n%2);
		}
		
	}

}
