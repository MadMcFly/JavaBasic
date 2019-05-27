package com.sl.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3_RemoveDuplicateInList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("c");
		
		removeDuplicateInList(list);
		System.out.println(list);
	}

	public static void removeDuplicateInList(List<String> list) {
		LinkedHashSet<String> linkedHS = new LinkedHashSet<>();
		linkedHS.addAll(list);
		list.clear();
		list.addAll(linkedHS);
	}
}
