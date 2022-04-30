package Section3;

import java.util.Scanner;

public class c4test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		int arr[] =new int [a];
		
		
		int goal=key.nextInt();
		
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		
		
		
		int lt=0;
		int sum=0;
		int cnt=0;
		for(int i=0;i<a;i++) {
			sum+=arr[i];
			if(sum==goal)cnt++;
			while(sum>=goal) {
				sum-=arr[lt++];
				if(sum==goal) cnt++;
			}
		}
		
		
		System.out.println(cnt);
		
		
		
	}

}
