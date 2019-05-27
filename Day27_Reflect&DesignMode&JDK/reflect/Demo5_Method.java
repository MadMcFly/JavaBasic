package com.sl.reflect;

import java.lang.reflect.Method;

import com.sl.bean.Person;

public class Demo5_Method {

	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("com.sl.bean.Person");
		Class c2 = Person.class;
		Person p = new Person(12, "alice");
		Class c3 = p.getClass();
		
		Method m1 = c1.getMethod("eat");
		Method m2 = c2.getMethod("eat", int.class);
		
		m1.invoke(p);
		m2.invoke(p, 10);
	}

}
