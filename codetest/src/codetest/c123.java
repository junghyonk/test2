package codetest;

import java.util.Scanner;

public class c123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr;
		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		arr=new int[a];
		int goal=key.nextInt();
		
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<a; rt++){
			sum+=arr[rt];
			if(sum==goal) answer++;
			while(sum>=goal){
				sum-=arr[lt++];
				if(sum==goal) answer++; 
			}
		}
		System.out.println(answer);
	}

}
