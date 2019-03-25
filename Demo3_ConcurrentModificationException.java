package com.sl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_ConcurrentModificationException {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("alice");
		list.add("c");
		//for a "alice" in list, we want to add a "bob" after it
//		demo1(list);
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			String s = (String)lit.next();
			if("alice".equals(s)) {
				lit.add("bob");
			}
		}
		
		System.out.println(list);
	}

	private static void demo1(List list) {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if("alice".equals(s)) {
				list.add("bob");		//ConcurrentModificationException
			}
		}
	}

}
