package Section7;

import java.util.ArrayList;
import java.util.Scanner;

public class cA12TTT {
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static int n,m,answer;
	static int []ch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		int m=key.nextInt();
		ch=new int [m];
		for(int i=1;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++) {
			int x=key.nextInt();
			int y=key.nextInt();

			graph.get(x).add(y);
		}
		
		ch[1]=1;
		
		DFS(1);
		
		
		System.out.println(answer);
		
	}

	private static void DFS(int L) {
		
		if(L==n) answer++;
		else {
			for(int i:graph.get(L)) {
				if(ch[i]==0) {
					ch[i]=1;
					DFS(i);
					ch[i]=0;
				}
			}
		}
	}

}
