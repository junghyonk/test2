package codetest;

public class ctest {

	static int a=12,b=18;
	public static void main(String[] args) {

		System.out.println(LCM(a,b));
		


	}

	private static int DFS(int i, int j) {
		
		if(j==0) {
			return i;
		}else {
			return DFS(j,i%j);
		}
		
	}	
	
	private static int  LCM(int x, int y) {
		return x * y / DFS(x, y); 
		}


}
