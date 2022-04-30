package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		String k=key.nextLine();
		
		for(char i:solution(k)) {
			System.out.print(i);
		}
	}

	private static Stack<Character> solution(String k) {
		Stack<Character> stack=new Stack<>();
		for(char i:k.toCharArray()) {
			stack.add(i);
			if(i==')')
				while(stack.pop()!='(');
		}
		return stack;
	}

}
