package Section7;

import java.util.Scanner;

public class c6t {
	static int [] ch;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		ch=new int[n+1];
		DFS(1);
	}
	private static void DFS(int L) {
		if(L==n+1) {
			for(int i=1;i<=n;i++) {
				if(ch[i]==1) {
					System.out.print(i+" ");
				}
			}

			System.out.println();
		}
		
		else {
			ch[L]=1;
			DFS(L+1);
			ch[L]=0;
			DFS(L+1);
		}
		
	}

}
