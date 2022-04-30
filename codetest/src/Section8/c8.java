package Section8;

import java.util.Scanner;

public class c8 {
	static int [][] dy=new int[100][100];
	static int [] b,ch,p;
	static boolean flag;
	static int n,f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		n=key.nextInt();
		f=key.nextInt();

		b=new int[n];
		p=new int[n];
		ch=new int[n+1];
		for(int i=0;i<n;i++) {
			b[i]=Combi(n-1,i);
		}
		DFS(0,0);
//		for(int i:b) {
//			System.out.print(i+" ");
//		}

	}
	private static void DFS(int L, int sum) {
		if(flag) return;
		if(L==n) {
			if(sum==f) {
				for(int i:p) {
					System.out.print(i+" ");
				}
			}
		}
		else {
			for(int i=1;i<=n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					p[L]=i;
					DFS(L+1, sum+(p[L]*b[L]));
					
				}
			}
		}
	}
	private static int Combi(int n, int r) {
		if(n==r || r==0) return 1;
		if(dy[n][r]>0) return dy[n][r];
		else return dy[n][r]=Combi(n-1,r-1)+Combi(n-1,r);
	}

}
