package codetest;

import java.util.HashMap;
import java.util.Map;

public class ctest123 {

	public static void main(String[] args) {
		
		String a="11001";
		
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character i:a.toCharArray()) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
	    for(char key:map.keySet()) {
		System.out.println(key+" "+map.get(key));
	    }
	}

}
