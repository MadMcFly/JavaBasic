package com.sl.reflect;

import com.sl.bean.Person;

public class Demo1_Reflect {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p = new Person(12, "alice");
		
		Class clazz1 = Class.forName("com.sl.bean.Person");
		Class clazz2 = Person.class;
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz3 == clazz2);
		
		p = (Person) clazz1.newInstance();				//newInstance() use constructor
														//without parameters!!!!
	}

}
