package Section7;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int k=key.nextInt();
		
		recur(k);
	}

	private static void recur(int k) {
	
		if(k==1) {

			System.out.println(k);	
			return;
		}
		else {
			recur(k-1);

			System.out.println(k);	
		}
				
	}

}
