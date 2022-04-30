package Section7;

import java.util.ArrayList;
import java.util.Scanner;

public class cA12 {
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
		
		for(int nv:graph.get(1)) {
			System.out.println(nv);
		}
//		DFS(1);
//		System.out.println(answer);
	}





	private static void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int nv:graph.get(v)) {
				if(ch[nv]==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
		
	}

}