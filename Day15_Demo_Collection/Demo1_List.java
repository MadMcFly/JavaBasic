package com.sl.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		/*list.remove("b");				//remove first, inherited from Collection
		System.out.println(list);*/
		
		Object obj = list.set(1, "bb");
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo3() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.get(3);
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.remove(0);
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(0, "z");
//		list.add(10, ""); 			//IndexOutOfBoundException
		list.add(5, ""); 			//int index <= size, can be added to tail
		System.out.println(list);
	}

}
