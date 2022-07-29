package com.varxyz.jv200.primenum;

public class MainTest {
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		boolean b;
		try {

			b = p.checkPrimeNum(6);

			if (b == true) {
				System.out.println("소수입니다");
			}
		} catch (NotPrimeNumber e) {
			System.out.println(e.getMessage());
		}
	}
}
