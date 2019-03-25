package com.sl.map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo9_HashtableAndHashMap {

	public static void main(String[] args) {
		/*Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put(null, 12);
		ht.put("alice", null);		//NullPointerException*/
	
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, null);
		System.out.println(hm);
	}

}
