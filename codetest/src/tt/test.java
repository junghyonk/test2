package tt;

import java.util.stream.Stream;

public class test {
	int max=Integer.MIN_VALUE;
	static String [] ex;
	static String [] num;
	public static void main(String[] args) {
	
			String s="100-200*300-500+20";
			
			String z=s.replaceAll("[0-9]","" );
			ex=z.split("");
			num=s.split("[^0-9]");


			for(String i:ex) {
				System.out.print(i+" ");
			}
			for(String i:num) {
				System.out.print(i+" ");
			}
			DFS(0,0);

	}

	private static void DFS(int dep, int sum) {
		if(dep==4) {
			
		}else {
			
		}
	}

}
