package Section7;

import java.util.Scanner;

public class cA11TT {
	static int n,m,answer;
	static int [][] graph;
	static int [] ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new int[n+1][n+1];
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1;
		}
		ch[1]=1;
		DFS(1);
		System.out.println(answer);
	}
	private static void DFS(int L) {
		
		if(L==n) answer++;
		else {
			
			for(int i=1;i<=5;i++) {
				if(graph[L][i]==1 &&ch[i]==0) {
					ch[i]=1;
					DFS(i);
					ch[i]=0;
				}
			}
			
			
			
			
		}
		
		
		
	}

}
