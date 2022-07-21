package com.varxyz.jv200.primenum;

public class PrimeNumber {
	NotPrimeNumber e;
//	int [] ar = new int[100];
	
	public boolean checkPrimeNum(int a) throws NotPrimeNumber {
		if(a < 2) {
			throw new RuntimeException("1보다 큰 수를 입력해주세요");
		}
		
		int b = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				
				b++;
			}
		}

		if (b == 2) {
			return true;
		} else {
			
			e = new NotPrimeNumber("소수가 아닙니다");
			throw e;
		}
	}
}