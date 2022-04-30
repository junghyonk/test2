package Section8;

import java.util.Scanner;

public class c1 {
	static int [] arr;
	static int total;
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
			total+=arr[i];
		}
		
		DFS(0,0);
		
	}
	private static void DFS(int dep, int sum) {
		if(flag) return;
		if(dep==6) {
			if(total/2==sum) {
				System.out.println("yes");
				flag=true;
			}
		}else {
			DFS(dep+1,sum+arr[dep]);
			DFS(dep+1,sum);
		}
	}

}
