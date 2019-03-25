package com.sl.collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo4_MethodOfAll {

	public static void main(String[] args) {
//		demo1();
		demo2();
//		demo3();
//		demo4();
	}

	private static void demo4() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("b");
		c1.add("c");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");
//		c2.add("c");				//false
		
		boolean b = c1.retainAll(c2);
		System.out.println(b);
		System.out.println(c1);		//[a, b, b]
	}

	private static void demo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("b");
		c1.add("c");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");				//false
		
		System.out.println(c1.containsAll(c2));
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("b");
		c1.add("c");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("z");				//delete all elements of intersection
		
		boolean b = c1.removeAll(c2);
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();	//alt + shift + r: change name
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);						//add all elements in c2
//		c1.add(c2);							//add c2 as an element
		System.out.println(c1);
	}

}
