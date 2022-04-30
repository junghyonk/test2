package Section2;

import java.util.Scanner;

public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		8 6
		//		1 2 1 3 1 1 1 2
		Scanner key = new Scanner(System.in);
		int n=key.nextInt();
		int m=key.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=key.nextInt();
		}
		System.out.print(solution(n, m, arr));

	}
	public static int solution(int n, int m, int[] arr){
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++){
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m){
				sum-=arr[lt++];
				if(sum==m) answer++; 
			}
		}
		System.out.println(lt);
		return answer;

	}
}
