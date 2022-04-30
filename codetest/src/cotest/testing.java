package cotest;

import java.util.Scanner;

public class testing {
	public static void main(String [] args) {
		
		
		String s="ab";
		String t="abtest";
		
//		if(s.startsWith(t) || t.startsWith(s)) {
//			System.out.println("¤¾");
//		}
		
		
		
		
		
		
		
		
		String q="123-456123-789";
		String [] z=q.split("-");
		
		for(int i=0;i<z.length-1;i++) {
			for(int j=i+1;j<z.length;j++) {
				if(z[i].contains(z[j])){
					System.out.println("ok");
				}
				if(z[j].contains(z[i])){
					System.out.println("ok");
				}
			}
		}
	}
}
