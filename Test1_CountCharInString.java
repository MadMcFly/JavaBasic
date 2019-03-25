package com.sl.test;

import java.util.HashMap;

public class Test1_CountCharInString {

	public static void main(String[] args) {
		String s = "abaaabbbbbcccdbababcd";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : arr) {
			/*if(hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}else {
				hm.put(c, 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
		}
		for (Character c : hm.keySet()) {
			System.out.println(c + "=" + hm.get(c));
		}
	}

}
