package Section8;

import java.util.Scanner;

public class c4 {
	static int n,m;
	static int [] arr,visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();//3 
		m=key.nextInt();//2
		
		arr=new int [m];
		visit=new int [m];
		
		DFS(0);
	}
	private static void DFS(int dep) {
		
		if(dep==m) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else {
			for(int i=1;i<=n;i++) {
				
					arr[dep]=i;
					DFS(dep+1);

				}	
			}
		
	}

}
