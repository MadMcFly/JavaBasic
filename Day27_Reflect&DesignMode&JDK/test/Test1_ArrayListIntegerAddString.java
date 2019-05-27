package com.sl.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1_ArrayListIntegerAddString {

	public static void main(String[] args) throws Exception, SecurityException {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(new Integer(12));
		
		Class clazz = list.getClass();
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(list, "asd");
		System.out.println(list);
	}

}
