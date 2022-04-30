package cotest;

import java.util.Scanner;

public class mrback {
	static int [] nx= {1,-1,0,0};
	static int [] ny= {0,0,1,-1};
	static int q,x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		5 3 6
//		0 2
//		1 2
//		2 2
//		3 2
//		4 2
//		4 0
		Scanner key = new Scanner(System.in);
		q=key.nextInt();
		
		while(q-->0) {
		x=key.nextInt();
		y=key.nextInt();
		int b=key.nextInt();
		
		int [] []arr=new int[x][y];
		
		for(int i=0;i<b;i++) {
			int xi=key.nextInt();
			int yi=key.nextInt();
			arr[xi][yi]=1;
		}
		
		int cnt=0;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(arr[i][j]==1) {
					cnt++;
					DFS(i,j,arr);
				}
			}
		}
		
		System.out.println(cnt);
		}
		
	}
	private static void DFS(int x1, int y1,int [][] arr) {
		arr[x1][y1]=0;
		
		for(int i=0;i<4;i++) {
			int dx=x1+nx[i];
			int dy=y1+ny[i];
			if(dx>=0 && dy>=0 && dx<x &&dy<y) {
				if(arr[dx][dy]==1) {
					DFS(dx,dy,arr);
				}
			}
		}
	}

}
