package Biztech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		String [] movie= {"spy","ray","spy","room","once","ray","spy","once"}; 
		Scanner key = new Scanner(System.in);
		for(String x:solution(movie)) {
			System.out.print(x+" ");
		}
	}

	private static String[] solution(String[] movie) {


		Map<String,Integer> map=new HashMap<>();

		for(int i=0;i<movie.length;i++) {
			map.put(movie[i], map.getOrDefault(movie[i], 0)+1);
		}		
		String [] ans= new String [map.size()];

		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});

		int lt=0;
		
		for(Entry<String, Integer> entry : list) {
			ans[lt++]=entry.getKey();
		}
		
		return ans;
		
	}

}
