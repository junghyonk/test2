package Section7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cA13TT {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph.get(a).add(b);
		}
		BFS(1);
	}
	private static void BFS(int L) {
		
		ch[L]=1;
		Queue<Integer> q=new LinkedList<>();
		q.offer(L);
		while(!q.isEmpty()) {
			int n=q.poll();
			for(int i:graph.get(n)) {
				
			}
		}
		
		
	}

}
