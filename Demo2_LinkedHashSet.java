package com.sl.set;

import java.util.LinkedHashSet;

class Demo2_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHS = new LinkedHashSet<>();
		linkedHS.add("a");
		linkedHS.add("a");
		linkedHS.add("a");
		linkedHS.add("b");
		linkedHS.add("b");
		linkedHS.add("c");
		linkedHS.add("c");
		linkedHS.add("d");
		
		System.out.println(linkedHS);
	}
}
