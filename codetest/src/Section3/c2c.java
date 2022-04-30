package Section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class c2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
		}
		for(int x : solution(n, m, a, b)) System.out.print(x+" ");
	}

	private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		
		ArrayList<Integer> arr=new  ArrayList<Integer> ();
		
		int p1=0;int p2=0;
		Arrays.sort(b);
		Arrays.sort(a);
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) {
				arr.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) { 
				p1++;
				System.out.println("i");
			}
			else p2++;
		}
		return arr;
		
	}

}
