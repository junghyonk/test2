package Cartest;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner key=new Scanner(System.in);
		Car car=new Car();
		int a=key.nextInt();
		car.setSpeed(a);
		while(car.getSpeed()>0) {
		int p=key.nextInt();
		if(p==1) System.out.println(car.up());
		if(p==2) System.out.println(car.down());
		}
	}

}
