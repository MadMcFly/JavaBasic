package com.sl.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.sl.bean.Student;

public class Demo3_TraverseByToArray {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Student("alice", 12));
		c.add(new Student("bob", 13));
		System.out.println(c);
		Object[] arr = c.toArray();
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			Student s = (Student)arr[i];
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

}
