package com.sl.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.sl.bean.Student;

public class Demo1_Generic {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("alice", 12));
		list.add(new Student("bob", 13));
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
//			System.out.println(it.next().getName() + "..." + it.next().getAge());
//			every it.next() will point to next element in list
			Student s = it.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

}
