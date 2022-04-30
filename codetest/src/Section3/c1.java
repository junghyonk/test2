package Section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		
		int a=key.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		int b=key.nextInt();
		int arr2[]=new int[b];
		for(int i=0;i<b;i++) {
			arr2[i]=key.nextInt();
		}
		
		ArrayList<Integer> array=new ArrayList<>();
		for(int i:arr) {
			array.add(i);
		}
		for(int i:arr2) {
			array.add(i);
		}
		Collections.sort(array);
		
		for(Integer a1:array) {
			System.out.print(a1);
		}
		
	}

}
