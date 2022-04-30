package Cartest;

import java.util.Scanner;

public class Car {

	int speed;
	Car(){
		
	}
	Car(int speed){
		this.speed=speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int up() {
		return this.speed+=10;
	
	}
	public int down() {

		return this.speed-=10;
	}
}
