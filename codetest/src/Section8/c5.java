package Section8;

import java.util.Scanner;

public class c5 {
	static int n,total;
	static int [] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=key.nextInt();
		}
		total=key.nextInt();
		DFS(0,0);
	}
	private static void DFS(int dep, int sum) {
		if(dep>n) return;
		if(sum==total) {
			System.out.println(dep);
		}else {
			for(int i=0; i<n; i++){
				DFS(dep+1, sum+arr[i]);
			}
		}
	}

}
