package codetest;

import java.util.Arrays;
import java.util.Comparator;

public class test3 {
	static Integer[]  abc= {1,5,2,3,0} ;
	public static Integer[] solution(Integer[] files) {

		Arrays.sort(files, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(o1+" "+o2);
				int result=o1-o2;
				System.out.println(result);
				return result;
			}
		}
				);		
		return files;	
	}
	public static void main(String[]args) {

		for(int i:solution(abc)) {
			System.out.println(i);
		}
		
		//solution(abc);
	}
	private static int  findNum(String s,String h) {
		s = s.replace(h, "");	
		String result ="";
		for( char c : s.toCharArray()) {
			if( Character.isDigit(c) && result.length() < 10 ) {
				result+=c;
			}else
				break;
		}
		return Integer.valueOf(result);

	}
}
