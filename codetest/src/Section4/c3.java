package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int a=key.nextInt();
		int t=key.nextInt();
		int [] arr=new int [a];
		for(int i=0;i<a;i++) {
			arr[i]=key.nextInt();
		}
		

		for(int i=3;i<a;i++) {
			Map<Integer,Integer> map=new HashMap<>();
			for(int j=i;j>=i-3;j--) {
				map.put(arr[j],map.getOrDefault(arr[j], 0)+1);
			}
			System.out.println("asd"+map.size());
		}
	}

}
