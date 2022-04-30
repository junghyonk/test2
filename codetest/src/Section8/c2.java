package Section8;

import java.util.Scanner;

public class c2 {
	static int [] arr;
	static int total;
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		total=key.nextInt();
		int a=key.nextInt();
		arr=new int [a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=key.nextInt();
		}
		DFS(0,0);
		System.out.println(max);
	}
	private static void DFS(int dep, int sum) {
		if(sum>total) return;
		if(dep==5) {
			max=Integer.max(sum, max);
		}
		else {
			DFS(dep+1,sum+arr[dep]);
			DFS(dep+1,sum);
		}
	}

}
