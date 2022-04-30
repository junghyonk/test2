package tt;

import java.util.Arrays;
import java.util.Scanner;



public class IntToInteger {

	public static void main(String[] args) {
		
		int [] arr= {2,3,4,1,};
		
		Integer [] tmp=Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		for(int i:tmp) {
			System.out.println(i);
		}
	}

}
