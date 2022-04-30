package tt;

import java.math.BigInteger;
import java.util.Scanner;

public class tttt {

	static int a=3;
	static int b=2;
	static int [] arr;
	static int [] visit;
	
	
	public static void main(String[] args) {
		
		
//		int c=BigInteger.valueOf(b).gcd(BigInteger.valueOf(a)).intValue();
//		System.out.println(c);
		arr=new int [b];
		visit=new int [b];
		
		DFS(0);
		
	}


	private static void DFS(int i) {
		//a=3;
		//b=2;
		if(i==a) {
			for(int z:arr) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		for(int j=1;j<=b;j++) {
			if(visit[j]==0) {
				visit[j]=1;
				arr[i]=j;
				DFS(i+1);
				visit[j]=0;
			}
		}
	}

}
