package com.varxyz.jv200.mod007;

public class AirPlane implements Flyer, Vehicle {
	public void takeoff() {
		System.out.println("AirPlane takeoff()");
	}

	public void fly() {
		System.out.println("AirPlane fly()");
	}

	public void land() {
		System.out.println("AirPlane land()");
	}
}
