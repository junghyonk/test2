package Section3;

import java.util.Scanner;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		System.out.println(S(a));
		
		
	}

	private static int S(int a) {
		
		int lt=0;int cnt=0; int m=a/2+1;int sum=0;
		int []arr=new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=i+1;
		}
		
		for(int rt=0;rt<m;rt++) {
			sum+=arr[rt];
			if(sum==a) cnt++;
			while(sum>=a) {
				sum-=arr[lt++];
				if(sum==a) cnt++;
			}
		}
		
		return cnt;
	}

}
