package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c3t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int a=key.nextInt();

		int [][] arr =new int[a+1][a+1];

		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				arr[i][j]=key.nextInt();
			}
		}
		int b=key.nextInt();
		int [] num=new int [b];
		for(int i=0;i<b;i++) {
			num[i]=key.nextInt();
		}


		Stack<Integer> stack=new Stack<>();

		int answer=0;
		for(int i=0;i<b;i++) {

			int x=num[i];
			int lt=0;
			while(lt++<a) {
				System.out.println("lt:"+lt +"  x"+x);
				if(arr[lt][x]!=0) {
					if(!stack.isEmpty() && stack.peek()==arr[lt][x]) {
						System.out.println("pop:"+stack.pop());
						arr[lt][x]=0;
						answer=answer+2;
						break;
					}
					else {
						System.out.println("push:"+stack.push(arr[lt][x]));
						arr[lt][x]=0;
						break;
						
					}
				}
			}
			

		}

		System.out.println(answer);
	}

}
