package com.sl.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayListRemoveDuplicates {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("c");
		System.out.println(removeDuplicates(list));
	}

	public static ArrayList removeDuplicates(ArrayList list) {
		ArrayList newList = new ArrayList();
		Iterator lit = list.iterator();
		while(lit.hasNext()) {
			Object o = lit.next();
			if(!newList.contains(o)) {
				newList.add(o);
			}
		}
		return newList;
	}
}
