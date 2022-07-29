package com.varxyz.jv200.mod003;

public class Test {
	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 2, 4, 5 };
		int[] a2 = new int[] { 1, 2, 4, 5 };
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] != a2[j]) {
					count++;
				}
			}
		}
		
		if(count == a2.length) {
			System.out.println("동일");
		}else if(count != a1.length) {
			System.out.println("포함");
		}else {
			System.out.println("포함되지 않음");
		}
	}
}
