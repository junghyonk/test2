package Section2;

import java.util.Scanner;

public class c3DFS {
static int max=Integer.MIN_VALUE;
static int [] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);

		int len=key.nextInt();
		int day=key.nextInt();

		arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=key.nextInt();
		}
		
		DFS(0,0);
		
		
		
	}

	private static void DFS(int dep, int sum) {
		if(dep==3) {
			max=Math.max(max, sum);
		}
		for(int i=0;i<10;i++) {
			sum+=arr[i];
			
		}
	}

}
