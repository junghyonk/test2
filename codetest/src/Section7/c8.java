package Section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class c8 {
	static int n,goal;
	static int [] move= {5,-1,1};
	static int [] ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		n=key.nextInt();
		goal=key.nextInt();
		
		System.out.println(BFS(n));
	}
	private static int BFS(int n) {
		
		Queue<Integer> q=new LinkedList<>();
		q.offer(n);
		ch=new int[10000];
		ch[n]=1;
		int L=0;
		while(!q.isEmpty()) {
			int len=q.size();
			for(int i=0;i<len;i++) {
				int p=q.poll();
				if(p==goal) return L;
				for(int j=0;j<move.length;j++) {
					int nx=p+move[j];
					if(nx>=1 && nx<9999 && ch[nx]==0) {
					q.offer(nx);
					ch[nx]=1;
					}
				}
			}
			L++;
			
		}
		return 0;
	}

}
