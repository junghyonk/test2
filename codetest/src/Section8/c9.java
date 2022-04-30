package Section8;

import java.util.Scanner;

public class c9 {
	static int n,m;
	static int [] arr,visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		n=key.nextInt();//4
		m=key.nextInt();//2
		
		arr=new int[m];
		visit=new int[m];
		
		DFS(0,1);
	}
	private static void DFS(int L, int k) {
		if(L==m) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		else{
			for(int i=k; i<=n; i++){
				arr[L]=i;
				DFS(L+1, i+1);
			
			}
		}
	}

}
