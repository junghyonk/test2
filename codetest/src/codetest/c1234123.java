package codetest;

import java.util.ArrayList;
import java.util.Scanner;

public class c1234123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner key = new Scanner(System.in);
		
		int start=1;
		int end=9;
		int total=10;
		
		//System.out.println(a=a+end);

		ArrayList<String> arr=new ArrayList<>();
		String a="00000000";
		a=a.substring(1);
		a=a+start;
		arr.add(a);
		while(total-->0) {
			if(start==end)break;
			if(end>start) {
				a=a.substring(1);
				a+=--end;
				arr.add(a);
			}else {
				a=a.substring(1);
				a+=++start;
				arr.add(a);
			}
		}
		//앞에 자르기 System.out.println();
		//a.replace((char)a.lastIndexOf(total), 'A');
		//System.out.println(a);

		
		for(String b:arr) {
			System.out.print(b+" ");
		}
	}

}
