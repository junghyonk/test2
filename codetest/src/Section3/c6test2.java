package Section3;

import java.util.Scanner;

public class c6test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int n=key.nextInt();
		int k=key.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=key.nextInt();
	
		int lt=0;
		int cnt=0;
		int answer=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) cnt++;
			while(cnt>k) {
				if(arr[lt]==0) cnt--;
				lt++;
			}
			System.out.println(lt);
			answer=Math.max(answer, i-lt+1);
		}
		System.out.println(answer);
		
		
	}

}
