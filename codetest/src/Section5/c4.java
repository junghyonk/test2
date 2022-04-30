package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);


		String a=key.nextLine();

		Stack<Integer> stack=new Stack<>();
		for(char i:a.toCharArray()) {
			if(i>='0' && i<='9') stack.push(i-48);
			else {
				int f=stack.pop();
				int s=stack.pop();
				int answer=0;
				if(i=='-') answer=s-f;
				else if(i=='/') answer=s/f;
				else if(i=='*') answer=s*f;
				else if(i=='+') answer=s+f;
				stack.push(answer);
			}
		}
		for(Integer i:stack) {
			System.out.println(i);
		}
	}

}
