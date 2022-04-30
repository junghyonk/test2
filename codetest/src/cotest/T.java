package cotest;

import java.util.Arrays;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int [] arr= {1,2,3};
		
		Integer [] a=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		String bb=" asd ";
		System.out.println(bb);
		bb=bb.trim();
		System.out.println(bb);
	}

}
