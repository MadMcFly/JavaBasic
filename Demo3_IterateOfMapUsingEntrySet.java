package com.sl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_IterateOfMapUsingEntrySet {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("alice", 12);
		m.put("bob", 13);
		m.put("cathy", 14);
		m.put("dwayne", 15);
		
		//Set<Map.Entry<K,V>> use the Iterator to get entry object
		//use entry object call method getKey(), getValue()
		/*Set<Map.Entry<String, Integer>> entrySet = m.entrySet();
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> en = it.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}*/
		
//		for(Map.Entry<String, Integer> en : m.entrySet()) {
		for(Entry<String, Integer> en : m.entrySet()) {	//import j...Map.Entry
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

}
