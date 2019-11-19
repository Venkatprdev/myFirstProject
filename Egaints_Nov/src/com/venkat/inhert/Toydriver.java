package com.venkat.inhert;

public class Toydriver {

	public static void main(String[] args) {
	// Up casting
		Toy t1 = new car();
		t1.move();
		t1.makesound();
		System.out.println("****************");
		Toy t2 = new Truck();
		t2.move();
		t2.makesound();
		System.out.println("*****************");
		Toy t3 = new Ball();
		t3.move();
		t3.makesound();
		System.out.println("*****************");
		
	}
}
