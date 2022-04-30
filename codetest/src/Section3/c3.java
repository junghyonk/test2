package Section3;

import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);

		int n=key.nextInt();
		int k=key.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=key.nextInt();
		}

		int sum=0;
		int answer=0;
		for(int i=0; i<k; i++) {
			sum+=arr[i];
		}

		answer=sum;
		System.out.println(sum);
		for(int i=k; i<n; i++){
			sum+=(arr[i]-arr[i-k]);
			System.out.println(sum);
			answer=Math.max(answer, sum);
		}
		System.out.println(answer);

	}

}
