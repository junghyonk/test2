package cotest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ctest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		String [] phoneBook= {"119", "97674223", "1195524421"};
		String s="11";

		System.out.println(check(phoneBook));
	}
	private static boolean check(String []phoneBook) {
		for(int i=0; i<phoneBook.length-1; i++) { 
			for(int j=i+1; j<phoneBook.length; j++) { 
				if(phoneBook[i].startsWith(phoneBook[j])) {return false;} 
				if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
				}
			}
		return true;
		

	}

}
