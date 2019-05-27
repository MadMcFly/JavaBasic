package com.sl.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	public static void main(String[] args) {
//		demo1();
		demo2();
//		demo3();
	}

	private static void demo3() {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("alice", 12);
		m.put("bob", 13);
		m.put("cathy", 14);
		m.put("dwayne", 15);
		System.out.println(m.get("bob"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.size());
	}

	private static void demo2() {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("alice", 12);
		m.put("bob", 13);
		m.put("cathy", 14);
		m.put("dwayne", 15);
		Integer i = m.remove("alice");
		System.out.println(i);
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

	private static void demo1() {
		Map<String, Integer> m = new HashMap<>();
		Integer i1 = m.put("alice", 12);
		Integer i2 = m.put("bob", 13);
		Integer i3 = m.put("cathy", 14);
		Integer i4 = m.put("alice", 15);
		System.out.println(i1);			//null
		System.out.println(i2);			//null
		System.out.println(i3);			//null
		System.out.println(i4);			//12
		System.out.println(m);			//out of order
	}

}
