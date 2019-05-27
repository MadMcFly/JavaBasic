package com.sl.list;

import java.util.ArrayList;

import com.sl.bean.Student;

public class Demo2_RemoveDupSelfDefinedClassObject {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("alice", 12));
		list.add(new Student("alice", 12));
		list.add(new Student("bob", 13));
		list.add(new Student("bob", 13));
		list.add(new Student("bob", 13));
		
		System.out.println(Demo1_ArrayListRemoveDuplicates.removeDuplicates(list));
	}

}
