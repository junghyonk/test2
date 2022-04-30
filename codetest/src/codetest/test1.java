package codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Point implements Comparable<Point> {
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {
		return o.x-this.x;
	}

}
public class test1 {
	static int n;
	static int cnt;
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		n=key.nextInt();
		
		ArrayList<Point> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x=key.nextInt();
			int y=key.nextInt();
			list.add(new Point(x,y));
		}
		Collections.sort(list);
		
		for(Point i:list) {
			System.out.println(i.y);
			
	
		}
		int max=Integer.MIN_VALUE;
		for(Point i:list) {
			if(max<i.y) {
				max=i.y;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	
}