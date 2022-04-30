package codetest;

import java.util.Scanner;

public class c16956t {
	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	static char answer [][];
	static int x,y;
	public static void main(String[] args) {
		boolean flag = false;
		Scanner key=new Scanner(System.in);
		x=key.nextInt();
		y=key.nextInt();
		key.nextLine();
		answer=new char[x+1][y+1];
		for(int i=0;i<x;i++) {
			String tmp=key.nextLine();
			for(int j=0;j<y;j++) {
				answer[i][j]=tmp.charAt(j);
			}
		}

		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				if(answer[i][j]=='W') {

					for(int k=0;k<4;k++) {
						int nx=i+dx[k];
						int ny=j+dy[k];

						if(nx>=0 && ny>=0 && nx<x && ny<y) {
							if(answer[nx][ny]=='.') {
								answer[nx][ny]='D';
							}else {
								if(answer[nx][ny]=='S') {
									System.out.println(0);
									flag = true;
								}
							}
						}
					}

				}
			}
		}




		if(!flag) {
			System.out.println(1);
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					System.out.print(answer[i][j]);
				}
				System.out.println();
			}
		}









	}

}
