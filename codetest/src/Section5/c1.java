package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		
		String k=key.nextLine();
		System.out.println(solution(k));
	
	}
	public static String solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		for(char x : str.toCharArray()){
			if(x=='(') stack.push(x);
			else{
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

}
