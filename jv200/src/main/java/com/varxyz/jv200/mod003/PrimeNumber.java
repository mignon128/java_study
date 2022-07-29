package com.varxyz.jv200.mod003;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			int j;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.print(i + " ");
			}
		}

//		 int count = 0;
//	      for(int i = 2; i < 1000; i++) {
//	         for(int j = 2; j <= i; j++) {
//	            if (i%j == 0) {
//	               count++;
//	            }
//	         }
//	         if (count == 1) {
//	            System.out.print(i+" ");
//	         }
//	         count = 0;
//	      }
	}
}
