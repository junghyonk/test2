package Section3;

import java.util.Scanner;

public class c5tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		
		int b=a/2+1;
		int sum=0;int cnt=0;int lt=1;
		for(int i=1;i<=b;i++) {
			sum+=i;
			if(sum==a) cnt++;
			while(sum>=a) {
				sum-=lt++;
				if(sum==a) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
