package Section3;

import java.util.Scanner;

public class c6test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int n=key.nextInt();
		int k=key.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=key.nextInt();
		
		
		int answer=0, cnt=0, lt=0;
		for(int rt=0; rt<n; rt++){
			if(arr[rt]==0) cnt++;
			while(cnt>k){
				if(arr[lt]==0) cnt--;
				lt++;
			}
			System.out.println("rt-lt:"+(rt-lt+1));
			answer=Math.max(answer, rt-lt+1);
			System.out.println(answer);
	}
		
		System.out.println(answer);
		
		
		
		
	}

}
