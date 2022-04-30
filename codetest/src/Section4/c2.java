package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		String a=key.nextLine();
		String b=key.nextLine();
		
		String answer="";
		Map<Character,Integer> map= new HashMap<>();
		for(char c:a.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map.get('a'));
		for(char x:b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) answer= "NO";
		}

	}
}
