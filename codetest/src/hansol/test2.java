package hansol;

import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		
		String s="bba";
		
		String str=s.toLowerCase();
		String answer="";
		Map<Character,Integer> map=new HashMap<>();
		for(char i:str.toCharArray()) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		int max=Integer.MIN_VALUE;
		for(char key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
			max=Math.max(max, map.get(key));
		}
		//System.out.println(max);
		
		
		for(char key:map.keySet()) {
			if(map.get(key)==max) {
				answer+=key;
			}
		}
		System.out.println(answer);
	}

}
