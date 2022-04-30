package Section8;

import java.util.Scanner;

public class d11 {
	static int answer=0, n;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	static int[][] board;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();
		board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=key.nextInt();
			}
		}
		solution(board);
		System.out.println(answer);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void solution(int[][] board) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					answer++;
					DFS(i,j);
				}
			}
		}
	}
	private static void DFS(int x, int y ) {
		board[x][y]=0;
		for(int i=0;i<7;i++) {
			int nx=dx[i]+x;
			int ny=dy[i]+y;
			if(nx>=0 && ny>=0 &&nx<n &&ny<n && board[nx][ny]==1) {
				board[nx][ny]=0;
				DFS(nx,ny);
			}

		}
	}

}
