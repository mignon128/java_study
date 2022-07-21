package com.varxyz.jv200.mod009;

import java.util.*;

public class ListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("one");
		list.add("second");
		list.add("3rd");
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s);
		}
		
//		for(int i = 0; i < list.size(); i++) { // 동적으로 할 때 사용
//			String Object = list.get(i);
//			System.out.println(Object);
//		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
		list2.add(1);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		
		for(Integer s : list2) {
			System.out.println(s);
		}
	}
}