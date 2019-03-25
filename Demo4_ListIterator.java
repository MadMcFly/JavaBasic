package com.sl.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4_ListIterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("--------------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
