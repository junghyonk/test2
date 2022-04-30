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
		// 0 �� 1 �� �Ҽ��� �ƴϴ�
		if(number < 2) {
			return false;
		}

		// 2 �� �Ҽ���
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
