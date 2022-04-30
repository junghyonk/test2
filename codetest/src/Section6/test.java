package Section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int a=key.nextInt();
		
		ArrayList<Point> arr=new ArrayList<Point>();
		for(int i=0;i<a;i++) {
			int x=key.nextInt();
			int y=key.nextInt();
			arr.add(new Point(x,y));
		}
		
		Collections.sort(arr);
		
		for(Point i:arr) {
			System.out.println(i.x+" "+i.y);
		}
	}

}
