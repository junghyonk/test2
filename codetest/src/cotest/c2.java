package cotest;

import java.util.Scanner;

public class c2 {
	static int [] map;
	static int dx[]= {1,-1,2,-2};
	static int visitr[];
	static int visitc[];
	static int cntr,cntc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int r=5;
		int c=3;
		map=new int[r*c];
		visitr=new int[r*c];
		visitc=new int[r*c];
		//1 1 0 1 1 0 0 0 1
		//1 0 1 1 0 1 0 0 0 0 1 1 0 1 1
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++){
				map[(i-1)*c+(j-1)]=key.nextInt();
			}
		}
//		for(int i=1;i<=r;i++) {
//			for(int j=1;j<=c;j++){
//				System.out.print(map[(i-1)*c+(j-1)]);
//			}
//			System.out.println();
//		}
		
		
		
		solution(r,c,map);
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++){
				System.out.print(map[(i-1)*c+(j-1)]);
			}
			System.out.println();
		}
		System.out.println(cntr+" "+cntc);
	}
	private static void solution(int r, int c, int[] map) {
		int [] answer= {};
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++){
				if(map[(i-1)*c+(j-1)]==1 && visitr[(i-1)*c+(j-1)]==0) {
					cntr++;
					DFSR((i-1)*c+(j-1));
					
				}else if(map[(i-1)*c+(j-1)]==0 && visitr[(i-1)*c+(j-1)]==0) {
						cntc++;
						DFSC((i-1)*c+(j-1));
						
					}
				}
			}
		}
	
	
	private static void DFSC(int x) {
		if(map[x]==1) {
		
			return;
			}
			map[x]=2;
			visitc[x]=1;
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				if(nx>=1 && nx<9 && map[nx]==0  && visitc[nx]==0) {
					map[nx]=2;
					visitc[nx]=1;
					DFSC(nx);
				}
			}
		}
	
	private static void DFSR(int x) {
		if(map[x]==0) {
		return;
		}
		map[x]=3;
		visitr[x]=1;
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			if(nx>=1 && nx<9 && map[nx]==1 && visitr[nx]==0) {
				map[nx]=3;
				visitr[nx]=1;
				DFSR(nx);
			}
		}
	}

}
