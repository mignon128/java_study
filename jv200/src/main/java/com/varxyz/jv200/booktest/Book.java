package com.varxyz.jv200.booktest;


public class Book {
	private int serial;
	private String name;
	
	public Book(int serial, String name) {
		this.serial = serial;
		this.name = name;
	}
	
	public int getSerial() {
		return serial;
	}
	public String getName() {
		return name;
	}

}
