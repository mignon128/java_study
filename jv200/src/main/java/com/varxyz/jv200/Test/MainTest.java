package com.varxyz.jv200.Test;

public class MainTest {
	public static void main(String[] args) {
		TestNum n = new TestNum();
		boolean c;
		try {
			c = n.primeNum(7);
			if (c == true) {
				System.out.println("소수이다");
			}
		} catch (NotTestNum e) {
			e.getMessage();
		}
	}
}
