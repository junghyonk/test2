package Section8;

import java.util.Scanner;

public class c6 {
	static int n,m;
	static int [] visit,arr,answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		n=key.nextInt();//3
		m=key.nextInt();//2
		visit=new int[n];
		arr=new int[n];
		answer=new int[m];
		for(int i=0;i<n;i++) {
			arr[i]=key.nextInt();
		}
		
		DFS(0);
	}
	private static void DFS(int dep) {
		
		if(dep==m) {
			for(int i:answer) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		else {
			for(int i=0; i<n; i++){
				if(visit[i]==0){
					visit[i]=1;
					answer[dep]=arr[i];
					DFS(dep+1);
					visit[i]=0;
				}
			}
		}

	}

}
