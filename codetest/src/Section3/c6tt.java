package Section3;

import java.util.Scanner;

public class c6tt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int a=key.nextInt();
		int [] arr= new int [ a];
		int b=key.nextInt();
		
		
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		int cnt=0;int lt=0;int answer=0;
		
		for(int rt=0;rt<a;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>b) {
				if(arr[lt++]==0) cnt--;
			}
			answer=Math.max(answer, rt-lt+1);
			
		}

		
		System.out.println(answer);
	}

}
