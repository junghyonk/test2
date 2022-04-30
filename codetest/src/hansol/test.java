package hansol;

import java.util.Scanner;

public class test {

	static int [] dx= {1,-1,0,0};
	static int [] dy= {0,0,1,-1};
	static int cnt=0;
	static int max=Integer.MIN_VALUE;
	static int x=3;
	static int y=2;


	public static void main(String[] args) {
		int [] x_axis= {2,1};
		int [] y_axis= {1};
		System.out.println(solution(x, y, x_axis,  y_axis));
		


	
	}
	public static int solution(int n, int m, int[] x_axis, int[] y_axis) {
		int [][]map=new int[n+x_axis.length][m+y_axis.length];
		 int [][]ch=new int[n+x_axis.length][m+y_axis.length];
		int answer = 0;
		//xรเ
		for(int z=0;z<x_axis.length;z++) {
			int tmp=x_axis[z];
			for(int i=0;i<m+y_axis.length;i++) {
				map[tmp][i]=1;
			}
		}
		//yรเ 
		for(int z=0;z<y_axis.length;z++) {
			int tmp=y_axis[z];
			for(int i=0;i<n+x_axis.length;i++) {
				map[i][tmp]=1;
			}
		}
		
	
		
		for(int i=0;i<n+x_axis.length;i++) {
			for(int j=0;j<m+y_axis.length;j++) {
				if(map[i][j]==0) {
				cnt=1;
				max=Math.max(DFS(i,j,n,m,ch,map,x_axis,y_axis), max);
				}
			}
		}
		answer=max;
		return answer;
	}
	private static int DFS(int x, int y,int n,int m,int [][] ch,int [][] map,int[] x_axis, int[] y_axis) {
		ch[x][y]=1;
		for(int i=0;i<4;i++) {
			int nx=dx[i]+x;
			int ny=dy[i]+y;
			if(nx>=0 && ny>=0 && nx<n+x_axis.length && ny<m+y_axis.length && ch[nx][ny]==0 && map[nx][ny]!=1) {
				ch[nx][ny]=1;
				cnt++;
				DFS(nx,ny,n,m,ch,map,x_axis,y_axis);
			}
		}
	return cnt;
		
		


	}

}
