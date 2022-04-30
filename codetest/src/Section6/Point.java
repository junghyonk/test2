package Section6;

import java.util.Scanner;

public class Point implements Comparable <Point>{
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}

	
	
}
