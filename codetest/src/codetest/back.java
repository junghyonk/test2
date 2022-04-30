package codetest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back {
	static int f,s,g,u,d;
	static int visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();//�ְ���
		s = sc.nextInt();//��ȣ ��
		g = sc.nextInt();//������ ��
		u = sc.nextInt();//��
		d = sc.nextInt();//�ٿ�
		visited = new int[f+1];

		bfs(f,s,g,u,d);
	}

	static void bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s]=0;//������ �湮��(��ư �ȴ������� 1�� ǥ��)
		
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

