package com.sl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2_IterateOfMapUsingkeySet {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		m.put("alice", 12);
		m.put("bob", 13);
		m.put("cathy", 14);
		m.put("dwayne", 15);
		
		//Iterate over Set's Iterator
		/*Set<String> set = m.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " = " + m.get(key));
		}*/
		
		//Iterate using foreach
		for (String string : m.keySet()) {
			System.out.println(string + " " + m.get(string));
		}
	}

}
