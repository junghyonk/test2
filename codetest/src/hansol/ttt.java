package hansol;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class t{
	int no=10;
	String name="";
	
	
	t(int no){
		this.no=no;
	}
	t(int no,String name){
		this(no);
		this.name=name;
	}

	
}
public class ttt {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "a");
		map.put(1, "b");
		map.put(1, "c");
		
		System.out.println(map.size());
		System.out.println(map.get(1));
		
	}

}
