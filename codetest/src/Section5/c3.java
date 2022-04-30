package Section5;

import java.util.Scanner;
import java.util.Stack;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int num=key.nextInt();
		int [] [] arr=new int[num+1][num+1];

		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				arr[i][j]=key.nextInt();
			}
		}

		//		for(int i=1;i<=num;i++) {
		//			for(int j=1;j<=num;j++) {
		//				System.out.print(arr[i][j]);
		//			}
		//			System.out.println();
		//		}

		int len=key.nextInt();
		int moves[]=new int[len];

		for(int i=0;i<len;i++) {
			moves[i]=key.nextInt();
		}

		//		for(int i=0;i<len;i++) {
		//			System.out.print(moves[i]+" ");
		//		}


		System.out.println(solution(arr,moves));
	}

	private static int solution(int[][] arr, int[] moves) {
		Stack<Integer> stack=new Stack<>();
		int cnt=0;

		for(int i=0;i<moves.length;i++) {
			int x=moves[i];
			int lt=0;
			while(lt<=6) {
				lt++;
				if(arr[lt][x]!=0) {
					if(!stack.isEmpty()&& stack.peek()==arr[lt][x]) {
						System.out.println("pop:"+stack.pop()); 
						cnt+=2;
						break;
					}
					else {
						System.out.println("push:"+arr[lt][x]);
						stack.push(arr[lt][x]);
						arr[lt][x]=0;
						break;
					}
				}
			}
		}


		return cnt;
	}

}
