package Section3;

import java.util.Scanner;

public class c5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		System.out.println(S(a));
		
		
	}

	private static int S(int n) {
		
		int answer=0, cnt=1;
		n--;
		while(n>0){
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}


}
