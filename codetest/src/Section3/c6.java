package Section3;

import java.util.Scanner;

public class c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int a=key.nextInt();
		int b=key.nextInt();

		int arr[] =new int [a];

		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}


		System.out.println(Sol(a,b,arr));
	}

	private static int Sol(int a, int b, int[] arr) {

		int lt=0;int cnt=0;int answer=0;
		
		for(int rt=0;rt<a;rt++) {
			if(arr[rt]==0) cnt++;
			while(cnt>b) {
				if(arr[lt++]==0) cnt--;
			}
			answer=Math.max(answer, rt-lt+1);
			System.out.println(answer);
		}
		return answer;

	}

}
