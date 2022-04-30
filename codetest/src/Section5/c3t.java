package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c3t {

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

		int lt=0;

		for(int i=0;i<b;i++) {

			int x=num[i];
			for(int j=1;j<=a;j++) {
				if(arr[j][x]!=0) {
					if(!stack.isEmpty() && stack.peek()==arr[j][x]) {
						System.out.println("pop:"+stack.pop());
						arr[j][x]=0;
						lt=lt+2;
						break;
					}
					else {
						System.out.println("push:"+stack.push(arr[j][x]));
						arr[j][x]=0;
						break;
					}
				}
			}

		}

		System.out.println(lt);
	}

}
