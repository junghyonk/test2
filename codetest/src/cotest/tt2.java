package cotest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tt2 {
	static int [][] map;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	static int [][] visit,dp;
	static int cnt=0;
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
		dp=new int[7][7];
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				map[i][j]=key.nextInt();
			}
		}

		visit[0][0]=1;
		DFS(0,0);

		System.out.println(cnt);
	}
	private static void DFS(int x, int y) {
		if(x==6 && y==6) {
			cnt++;
			return;
		}else {
			for(int i=0;i<4;i++) {
				int nx=dx[i]+x;
				int ny=dy[i]+y;
				if ((0 <= nx && nx < 7) && (0 <= ny && ny < 7) &&visit[nx][ny]==0 && map[nx][ny]==0) {
					visit[nx][ny]=1;
					DFS(nx,ny);
					visit[nx][ny]=0;
				}
			}
		}
	}
}
