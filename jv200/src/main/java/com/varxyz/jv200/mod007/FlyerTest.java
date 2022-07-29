package com.varxyz.jv200.mod007;

public class FlyerTest {
	public static void main(String[] args) {
		Flyer plane = new AirPlane();
		plane.takeoff();
		plane.fly();
		plane.land();

		Flyer bird = new Bird();
		bird.takeoff();
		bird.fly();
		bird.land();
	}
}
