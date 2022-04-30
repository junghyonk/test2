package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		Map<Character,Integer> map=new HashMap<>();
		
		String a=key.nextLine();
		
		for(char i:a.toCharArray()) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		int max=0;
		char answer = 0;
		for(char keys:map.keySet()) {
			if(map.get(keys)>max) {
				max=map.get(keys);
				answer = keys;
			}
		}
		System.out.println(max);
		System.out.println(answer);
		
		
	}

}
