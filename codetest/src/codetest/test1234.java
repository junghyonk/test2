package codetest;

import java.util.HashSet;
import java.util.Set;

public class test1234 {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(2);
		set.add(1);
		
		System.out.println(set.hashCode());
	}

}
