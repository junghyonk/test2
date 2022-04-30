package Section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		

		ArrayList<Integer> array=new ArrayList<>();
		ArrayList<Integer> array2=new ArrayList<>();
		int a=key.nextInt();
		for(int i=0;i<a;i++) {
			int k=key.nextInt();
			array.add(k);
		}
		int b=key.nextInt();
		for(int i=0;i<b;i++) {
			int k=key.nextInt();
			array.add(k);
		}
		Collections.sort(array);
		
		for(int i=1;i<array.size();i++) {
			if(array.get(i-1)==array.get(i)) {
				array2.add(array.get(i));
			}
		}
		for(Integer i:array2) {
			System.out.println(i);
		}
	}

}
