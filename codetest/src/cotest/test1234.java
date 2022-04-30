package cotest;

import java.util.Scanner;

public class test1234 {
	static int cnt0=0;
	static int cnt1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		fibonacci(3);
		System.out.println(cnt0+" "+cnt1);
		
	}
	private static int fibonacci(int n) {
	    if (n == 0) {
	    	cnt0++;
	        return 0;
	    } else if (n == 1) {
	    	cnt1++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}

}
