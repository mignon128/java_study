package com.varxyz.jv200.mod009;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "����");
		map.put(2, "����"); // boxing & unboxing -> AutoBoxing
		map.put(new Integer(3), "���"); // 9버전 이하일 때 사용
		
		System.out.println(map.get(1));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}
}
