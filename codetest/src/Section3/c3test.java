package Section3;

import java.util.Scanner;

public class c3test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		int b=key.nextInt();
		
		int [] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		
		int sum=arr[0]+arr[1]+arr[2];
		int max=sum;
		for(int i=3; i<a; i++){
			sum=sum+arr[i]-arr[i-3];
			max=Math.max(max, sum);
		
		}
		System.out.println(max);
		
		
	}

}
