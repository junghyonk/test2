package Biztech;

import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		String rid="000101-2237890";
		solution(rid);
	}

	private static void solution(String rid) {
		String answer="";
		String[] tmp=rid.split("-");
		
		String year=tmp[0];
		//System.out.println(year);
		int ny=Integer.parseInt(year.substring(0,2));
		String st=year.substring(0,2);
		//System.out.println(ny);
		
		
		String sex=tmp[1];
		//System.out.println(sex);
		int ns=Integer.parseInt(sex.substring(0,1));
		//System.out.println(ns);
		
		
		String nine="19";
		String two="20";
		String male="/M";
		String female="/F";
		if(ny>=0 && ny<=99 && ns==1) {
			nine=nine+st+male;
			answer=nine;
		}
		else if(ny>=0 && ny<=99 && ns==2) {
			nine=nine+st+female;
			answer=nine;
		}
		else if(ny>=0 && ny<=99 && ns==3) {
			two=two+st+male;
			answer=two;
		}
		else if(ny>=0 && ny<=99 && ns==4) {
			two=two+st+female;
			answer=two;
		}
		System.out.println(answer);
		
		
	}

}
