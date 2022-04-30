package Section3;

import java.util.Scanner;

public class c3t {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		int b=key.nextInt();
		
		int [] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		
		
		int sum=0;
		for(int i=0;i<b;i++) {
			sum+=arr[i];
		}
		int max=sum;
		for(int i=b;i<a;i++) {
			sum=sum+(arr[i]-arr[i-b]);
			System.out.println(sum+"  1");
			max=Math.max(max,sum);
			System.out.println(max);
		}
		System.out.println(max);
	}

}
