package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		int m=a/2+1;
		int[] arr=new int[m];
		
		int sum=0;
		
		int lt=1;
		int answer=0;
		for(int i=1;i<=m;i++) {
			sum+=i;
			if(sum==a) answer++;
			while(sum>=a) {
				sum-=lt++;
				if(sum==a)answer++;
			}
		}
		System.out.println(answer);
	}

}
