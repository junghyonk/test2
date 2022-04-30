package codetest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back {
	static int f,s,g,u,d;
	static int visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();//최고층
		s = sc.nextInt();//강호 층
		g = sc.nextInt();//가야할 곳
		u = sc.nextInt();//업
		d = sc.nextInt();//다운
		visited = new int[f+1];

		bfs(f,s,g,u,d);
	}

	static void bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s]=0;//시작점 방문함(버튼 안눌렀지만 1로 표시)
		
		while(!q.isEmpty()) {
			int n=q.poll();
			int un=n+u;
			int dn=n-d;
			
			if(n==g) {
				System.out.println(visited[n]);
			}
			if(un<=f && visited[un]==0) {
				visited[un]=visited[n]+1;
				q.offer(un);
			}
			if(dn>0 && visited[dn]==0) {
				visited[dn]=visited[n]+1;
				q.offer(dn);
			}
		}
		if(visited[g]==0)
			System.out.println("use the stairs");
		
	}



}

