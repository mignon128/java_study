package com.varxyz.jv200.Test;

public class TestNum {
	NotTestNum e;

	public boolean primeNum(int a) throws NotTestNum {
		if(a < 2) {
			throw new RuntimeException("1보다 큰 수를 입력해주세요");
		}
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			e = new NotTestNum("소수 아님");
			throw e;
		}
	}
}
