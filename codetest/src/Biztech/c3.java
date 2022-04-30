package Biztech;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int [] prices= {32000,18000,42500};
		int [] discounts= {50,20,65};
		solution(prices,discounts);
	}

	private static void solution(int[] prices, int[] discounts) {
		int sum=0;
		
		Integer[] pr= Arrays.stream(prices).boxed().toArray(Integer[]::new);
		Integer[] di= Arrays.stream(discounts).boxed().toArray(Integer[]::new);

		Arrays.sort(pr,Collections.reverseOrder());
		Arrays.sort(di,Collections.reverseOrder());

		int lt=0;
		for(int i=0;i<pr.length;i++) {
			int p=pr[i];
			if(lt<di.length) {
			System.out.println(p +" "+di[lt]);
			p=(int) (p*((100-di[lt++])*0.01));
			System.out.println(p);
			}
			sum+=p;
		}
		System.out.println(sum);
	}

}
