package Section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class d10 {
	static int [][] board,dis;
	static int n,m,cnt;
	static int max=Integer.MIN_VALUE;
	static int [] dx= {1,-1,0,0};
	static int [] dy= {0,0,1,-1};
	static Queue<Point> q=new LinkedList<Point>();
	public static void main(String[] args) {

		Scanner key=new Scanner(System.in);

		m=key.nextInt();
		n=key.nextInt();
		board=new int[n][m];
		dis=new int[n][m];
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				board[i][j]=key.nextInt();
				if(board[i][j]==1) q.offer(new Point(i, j));
			}
		}

		BFS();
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(dis[i][j]);
			}
			System.out.println();
		}
	}
	private static void BFS() {
		while(!q.isEmpty()) {
			Point tmp=q.poll();
			for(int i=0;i<4;i++) {
				int nx=dx[i]+tmp.x;
				int ny=dy[i]+tmp.y;
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
					board[nx][ny]=1;
					q.offer(new Point(nx, ny));
					dis[nx][ny]=dis[tmp.x][tmp.y]+1;
				}
			}

		}

	}

}
