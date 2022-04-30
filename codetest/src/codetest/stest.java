package codetest;

import java.util.Scanner;
class Pa{
	void print() {
		t();
	}
	void draw() {
		System.out.println("parent");
	}
	void t() {
		System.out.println("parent");
	}
}
class ch extends Pa{
	
	void print() {
	super.print();
	super.draw();
	}
	void draw() {
		System.out.println("child");
	}
	void t() {
		System.out.println("child");
	}
}
public class stest {

	public static void main(String[] args) {
		
		Pa c=new ch();
		c.print();
	}

}
