package com.sl.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4_SortStringListMaintainDuplicate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("good");
		list.add("bug");
		list.add("cat");
		list.add("cathy");
		list.add("alice");
		list.add("bob");
		list.add("bbb");
		
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
			//anonymous inner class
			@Override
			public int compare(String o1, String o2) {
				int num = o1.compareTo(o2);
				return num == 0 ? 1 : num;
			}
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
