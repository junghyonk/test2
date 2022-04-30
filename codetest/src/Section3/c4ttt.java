package Section3;

import java.util.Scanner;

public class c4ttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		int b=key.nextInt();
		
		int [] arr=new int[a];
		
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		int sum=0;int lt=0;int cnt=0;
		for(int i=0;i<a;i++) {
			sum+=arr[i];
			if(sum==b) cnt++;
			while(sum>=b) {
				sum-=arr[lt++];
				if(sum==b) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
