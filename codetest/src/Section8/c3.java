package Section8;

import java.util.Scanner;

public class c3 {
	static int [] num,time;
	static int n,m;
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		m=key.nextInt();
		num=new int[n];
		time=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=key.nextInt();
			time[i]=key.nextInt();
		}
		DFS(0,0,0);
		System.out.println(max);
		
	}
	private static void DFS(int dep, int sum, int tim) {
		if(dep==n) {
			if(tim<=m) {
				max=Integer.max(sum,max);
			}
		}
		else {
			DFS(dep+1,sum+num[dep],tim+time[dep]);
			DFS(dep+1,sum,tim);
		}
	}

}
