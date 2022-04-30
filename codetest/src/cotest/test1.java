package cotest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		Map<Integer,String> map=new HashMap<>();
		map.put(1,"3");
		map.put(2,"1");
		map.put(2,"4");

		// 방법2
		//        for( Entry<Integer, String> elem : map.entrySet() ){
		//            System.out.println( String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
		//        }

		//		for(Integer i:map.keySet()) {
		//			System.out.println(i+" "+map.get(i));
		//		}

		int [] arr= {4,3,1};
		ArrayList<Integer> ap=new ArrayList<>();
		ap.add(3);
		ap.add(2);
		ap.add(1);
		Collections.sort(ap,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
			
		});
		
		for(int i:ap) {
			System.out.println(i);
		}

}

}
