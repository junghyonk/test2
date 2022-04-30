package Section7;

import java.util.Scanner;

public class c6 {
	static int [] arr;
	static int k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		k=key.nextInt();
		arr=new int[k+1];
		DFS(1);
	}
	private static void DFS(int L) {
		 if(L==k+1) {
		      for(int i=1;i<=k;i++) {
		        if(arr[i]==1) {
		         System.out.print(i+" ");
		        }
		      }
		      System.out.println();
		    }
		    else {
		      arr[L]=1;
		      DFS(L+1);
		      arr[L]=0;
		      DFS(L+1);
		    }
	}
}
