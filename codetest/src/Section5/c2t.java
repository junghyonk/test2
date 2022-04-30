package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c2t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		String k=key.nextLine();
		String answer="";
		Stack<Character> stack=new Stack<>();
		
		for(char i :k.toCharArray()) {
			stack.push(i);
			if(i==')') {
				while(!(stack.pop()=='('));
			}
		}
		
		
	for(char i:stack) {
		System.out.println(i);
	}
		
		System.out.println();
	}

}
