package Section7;

import java.util.Scanner;

public class c4 {
	static int []fibo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int k=key.nextInt();
		fibo=new int[k+1];
		
		recur(k);
		
		for(int i:fibo) {
			System.out.println(i);
		}
	}
	private static int recur(int n) {
		
		if(n==1 || n==2) fibo[n]=1;
		if(fibo[n]>0) return fibo[n];
		else{
			return fibo[n]=recur(n-1)+recur(n-2);
		}
	}

}
