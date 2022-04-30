package Section7;

import java.util.ArrayList;
import java.util.Scanner;

public class cA12TT {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);
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
