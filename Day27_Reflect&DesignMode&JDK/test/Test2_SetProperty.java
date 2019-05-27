package com.sl.test;

import com.sl.bean.Person;

public class Test2_SetProperty {
	//method in class Tool.setProperty()
	public static void main(String[] args) throws Exception {
		Person p = new Person(12, "alice");
		System.out.println(p);
		
		Tool.setProperty(p, "name", "bob");
		System.out.println(p);
	}

}
