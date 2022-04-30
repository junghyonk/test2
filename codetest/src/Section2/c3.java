package Section2;

import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
//		10 3
//		12 15 11 20 25 10 20 19 13 15

		Scanner key = new Scanner(System.in);
		
		int len=key.nextInt();
		int day=key.nextInt();
		
		int [] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=key.nextInt();
		}
		int sum=0;
		for(int i=0;i<day;i++) {
			sum+=arr[i];
		}
		int lt=0;
		int answer=0;
		int max=sum;
		for(int i=day;i<len;i++) {
			max=max+(arr[i]-arr[lt++]);
			answer=Math.max(max, answer);
		}

		
	System.out.println(answer);	
	}

}
