package cotest;

import java.util.ArrayList;
import java.util.Scanner;


public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int [][] arr= {
				{2,2},
				{4,4},
				{1,1},
				{-1,4},
				{8,8}
		};
int cnt=0;
		System.out.println(arr[1][0]);
		for(int i=1;i<arr.length;i++) {

			for(int z=0;z<arr.length;z++) {
			for(int j=0;j<2;j++) {
					if(arr[i][j]+z==arr[z][j]) {
						cnt++;
						System.out.println("arr[i][j]+z:"+(arr[i][j]+z)+" arr[z][j]:"+arr[z][j]);
					}
				}
			}
			System.out.println();

		}

System.out.println(cnt);
	}

	//sol(arr);


	private static void sol(int[][] arr) {
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<2;j++) {
				if(arr[i][j]!=0) {
					answer++;
					if(arr[i+i][j+j]!=0) {

					}
				}
			}
			System.out.println();
		}

	}

}
