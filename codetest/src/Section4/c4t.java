package Section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c4t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		String a=key.nextLine();
		String b=key.nextLine();
		int len=b.length()-1;
		Map<Character,Integer> am=new HashMap<>();
		Map<Character,Integer> bm=new HashMap<>();
		
		for(char i:b.toCharArray()) {
			bm.put(i, bm.getOrDefault(i, 0)+1);
		}
		
		for(int i=0;i<len;i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
		}
		
		int lt=0;int answer=0;
		for(int rt=len;rt<a.length();rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) {
				am.remove(a.charAt(lt));
			}
			lt++;
		}
		System.out.println(answer);
		
		
		
		
		
		
	}

}
