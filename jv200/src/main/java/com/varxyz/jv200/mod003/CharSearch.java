package com.varxyz.jv200.mod003;

public class CharSearch {
	public static boolean isSubString(String item, String line) {
		return line.contains(item);

	}
	public static void main(String[] args) {
		System.out.println(isSubString("T","The cat in the hat"));
	}
}