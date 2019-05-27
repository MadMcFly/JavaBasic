package com.sl.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.sl.bean.Student;

public class Demo2_StringAndSelfDefinedClass {

	public static void main(String[] args) {
//		demo1();
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("alice", 12));
		list.add(new Student("bob", 13));
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
