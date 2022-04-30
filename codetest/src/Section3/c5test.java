package Section3;

import java.util.Scanner;

public class c5test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int a=key.nextInt();
		int sum=0;
		int cnt=0;
		int lt=0;
		for(int i=1;i<a/2+1;i++) {
			sum+=i;
			if(sum==a) cnt++;
			while(sum>=a) {
				sum-=lt++;
				if(sum==a)cnt++;
			}
		}
		System.out.println(cnt);
	}

}
