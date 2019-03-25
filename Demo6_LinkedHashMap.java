package com.sl.map;

import java.util.LinkedHashMap;

public class Demo6_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("alice", "12");
		lhm.put("bob", "13");
		lhm.put("dwayne", "15");
		lhm.put("cathy", "14");
		
		//store in the order of put
		System.out.println(lhm);
	}

}
