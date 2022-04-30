package codetest;

import java.util.Scanner;

public class hi {

	static int [][]map;
	static int [][]arr;
	static int [][]visit;
	static int [] dx= {1,-1,0,0};
	static int [] dy= {0,0,-1,1};
	static int m,n;
	public static void main(String[]args) {

		Scanner key=new Scanner(System.in);

		m=key.nextInt();
		n=key.nextInt();

		map=new int[m][n];
		arr=new int[m][n];
		visit=new int[m][n];

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				map[i][j]=key.nextInt();
			}
		}
		visit[0][0]=1;
		System.out.println(DFS(0,0));
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
	private static int DFS(int x, int y) {


		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0 && ny>=0 && nx<m && ny<n) {

				if(map[x][y]>map[nx][ny]) {
					if(nx==m-1 && ny==n-1) {
						System.out.println("i");
						arr[x][y]+=1;
					}
					if(arr[nx][ny]>0) {
						arr[x][y]+=arr[nx][ny];
						System.out.println("z");
					}
					else {
						arr[x][y]+=DFS(nx,ny);
					}
				}
			}
		}
		return arr[x][y];




	}
}
