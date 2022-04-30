package codetest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point2{
	int x;
	int y;
	Point2(int x,int y){
		this.x=x;
		this.y=y;
	}
}
public class ctest12345 {
	static int a,b;
	static int [][] map;
	static int [][] arr;
	static int [][] visit;
	static int cnt;
	static int []dx= {-1,1,0,0};
	static int [] dy= {0,0,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		a=key.nextInt();
		b=key.nextInt();
		key.nextLine();
		map=new int[a][b];
		visit=new int[a][b];
		arr=new int[a][b];
		for(int i=0;i<a;i++) {
			String tmp=key.nextLine();
			for(int j=0;j<b;j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		visit[0][0]=1;
		
		BFS(0,0);
		System.out.println(map[4-1][6-1]);
	
	}
	private static void BFS(int x, int y) {
		Queue<Point2> q=new LinkedList<>();
		q.add(new Point2(x,y));
		
		while(!q.isEmpty()) {
			Point2 tmp=q.poll();
			for(int i=0;i<4;i++) {
				int nx=tmp.x+dx[i];
				int ny=tmp.y+dy[i];
				if(nx>=0 &&nx<a && ny>=0  &&ny<b && map[nx][ny]==1 && visit[nx][ny]==0 ) {
					map[nx][ny]=map[tmp.x][tmp.y]+1;
					visit[nx][ny]=1;
					q.add(new Point2(nx,ny));

				}
				if(nx==a-1 && ny==b-1) {
					return ;
				}
			}
		}
		
	}

}
