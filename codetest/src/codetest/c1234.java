package codetest;

public class c1234 {
	static int [] [] map= {{1,4},{3,4},{3,10}};
	public static void main(String[] args) {


		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

		for(int i:solution(map)) {
			System.out.print(i+" ");	
		}
		

	}
	private static int[] solution(int[][] map2) {
		int x = 0;
		int y = 0;
		
		if(map2[0][0]==map2[2][0]) {
			x=map2[1][0];
		}else if(map2[0][1]==map2[1][0]) {
			x=map2[2][0];
		}else {
			x=map2[0][0];
		}
		
		
		if(map2[2][1]==map2[1][1]) {
			y=map2[0][1];
		}else if(map2[0][1]==map2[1][1]) {
			y=map2[2][1];
		}else {
			y=map2[1][1];
		}
		
		int []answer= {x,y};
		return answer;
	}

}
