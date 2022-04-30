package cotest;

import java.util.Scanner;

public class test123 {

	public static void main(String[] args) {

		int [][]v= {{1,4},{3,4},{3,10}};

		Scanner key = new Scanner(System.in);

		//System.out.println(v[1][1]);
		for(int i:sol(v)) {
			System.out.println(i);
		}
	}

	private static int[] sol(int[][] v) {
		int []answer=new int[2];

		if(v[0][0]==v[1][0]) {
			answer[0]=v[2][0];
		}
		else if(v[0][0]==v[2][0]) {
			answer[0]=v[1][0];
		}else {
			answer[0]=v[0][0];
		}
		
		if(v[0][1]==v[1][1]) {
			answer[1]=v[2][1];
		}
		else if(v[0][1]==v[2][1]) {
			answer[1]=v[1][1];
		}
		else {
			answer[1]=v[0][1];
		}
		return answer;

	}

}
