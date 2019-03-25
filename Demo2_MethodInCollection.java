package com.sl.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.sl.bean.Student;

public class Demo2_MethodInCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();	//List the add always return true
										//for Set add duplicate is false
		System.out.println(c.add("alice"));
		System.out.println(c.add(12));
		System.out.println(c.add(true));
		System.out.println(c.add(new Student("alice", 12)));
		System.out.println(c.add("alice"));
		System.out.println("------------");
		c.remove("alice");				//remove the first match element
//		c.clear();
		System.out.println(c.contains(12));
		System.out.println(c.isEmpty());
		System.out.println(c.size()); 	//the number of element in this collection
		
		System.out.println(c); 			//override the toStirng() method
	}

}
