package Section3;

import java.util.Scanner;

public class c3testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		int b=key.nextInt();
		
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		int sum=0;
		for(int i=0;i<b;i++) {
			sum+=arr[i];
		}
		int answer=sum;
		
		for(int i=3;i<a;i++) {
			sum=sum+(arr[i]-arr[i-b]);
			
			answer=Math.max(answer, sum);
		}
		
		System.out.println(answer);
		
		
	}

}
