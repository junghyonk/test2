package cotest;

import java.util.ArrayList;
import java.util.Scanner;

public class rgb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		
		int k=key.nextInt();
		int [] arr=new int[k*3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=key.nextInt();
		}
		
		//for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		int sum=0;
		ArrayList<Integer> arr2=new ArrayList<>();
		for(int i=2;i<arr.length;i+=3) {
			int max=Math.min(Math.min(arr[i], arr[i-1]), arr[i-2]);
			sum+=max;
			arr2.add(max);
			System.out.println(max);
		}
		System.out.println(sum);
	}

}
