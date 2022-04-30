package Section8;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		int k=key.nextInt();
		if(prime(k)) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	}

	private static boolean prime(int number) {
		// 0 과 1 은 소수가 아니다
		if(number < 2) {
			return false;
		}

		// 2 는 소수다
		if(number == 2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
