package Section7;

import java.util.Scanner;

public class c6tt {
	static int [] check;
	static int k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);


		k=key.nextInt();
		check=new int[k+1];
		DFS(1);
	}
	private static void DFS(int L) {

		if(L==k+1) {
			for(int i=1;i<=k;i++) {
				if(check[i]==1) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}else {
			check[L]=1;
			DFS(L+1);
			check[L]=0;
			DFS(L+1);
		}








	}

}
