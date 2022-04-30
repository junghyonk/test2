package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c1t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		String k=key.nextLine();
		String answer="yes";
		Stack<Character> stack=new Stack<>();
		for(char i:k.toCharArray()) {
			if(i=='(') 	stack.push(i);
			else {
				if(stack.isEmpty()) answer="no";
				stack.pop();
			}
			
		}
		if(!stack.isEmpty()) answer= "NO";
		System.out.println(answer);
		
	}

}
