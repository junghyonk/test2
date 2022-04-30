package cotest;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		String s=key.nextLine();
		String answer = "";
		String[] strings = s.split(" ");
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		int[] nums = new int[strings.length];

		for(int i=0; i<strings.length; i++) {
			nums[i] = Integer.parseInt(strings[i]);
		}

		for(int i:nums) {
			max=Math.max(i, max);
			min=Math.min(min, i);
		}
		
		System.out.println("max"+max+" min"+min);
	}

}
