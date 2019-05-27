package com.sl.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo1_CollectionsMethod {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);		//random order with same elements
		System.out.println(list);
	}

	private static void demo2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("g");
		list.add("a");
		list.add("d");
		list.add("f");
		
		System.out.println(Collections.binarySearch(list, "a"));
		System.out.println(Collections.binarySearch(list, "z"));
		//non-existing then return -insertion-1
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("a");
		list.add("g");
		list.add("d");
		list.add("f");
		
		System.out.println(list);	//sort using Comparable
									//can using self defined Comparator
		Collections.sort(list);
		System.out.println(list);
	}

}
