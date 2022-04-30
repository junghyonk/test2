package cotest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
	int x;int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class tt {
	static int [][] map;
	static int[] nx= {1,-1,0,0};
	static int[] ny= {0,0,1,-1};
	static int [][] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 1 0 0 0
1 0 0 0 1 0 0
1 0 1 0 0 0 0
		 */
		Scanner key = new Scanner(System.in);
		map=new int[7][7];
		visit=new int[7][7];
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				map[i][j]=key.nextInt();
			}
		}
		
		
		BFS(0,0);
		
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	private static void BFS(int x, int y) {
		
		Queue<Point> q=new LinkedList<>();
		q.offer(new Point(x,y));
		visit[x][y]=1;
		while(!q.isEmpty()) {
			Point tmp=q.poll();
			for(int i=0;i<4;i++) {
				int dx=nx[i]+tmp.x;
				int dy=ny[i]+tmp.y;
				if(dx>=0 && dx<7 &&dy>=0 && dy<7 && map[dx][dy]==0&& visit[dx][dy]==0) {
					visit[dx][dy]=1;
					map[dx][dy]=map[tmp.x][tmp.y]+1;
					q.offer(new Point(dx,dy));
				}
			}
			
		}
	}

}
