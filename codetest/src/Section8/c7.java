package Section8;

import java.util.Scanner;

public class c7 {
	static int n,r;
	static int [][] dy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		r=key.nextInt();
		dy=new int [100][100];
		DFS(n,r);
		System.out.println(dy[n][r]);
	}
	private static int DFS(int n, int r) {
		if(n==r) return 1;
		if(r==0) return 1;
		if(dy[n][r]>0) return dy[n][r];
		else return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
	}

}
