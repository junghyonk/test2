package codetest;

import java.math.BigInteger;
import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		System.out.println(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue());
		System.out.println(gcd(a,b));
	}

	private static int gcd(int n, int m) {
		if(m==0 ) return n;
		else return gcd(m,n%m);
	}

}
