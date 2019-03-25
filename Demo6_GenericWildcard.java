package com.sl.generic;

import java.util.ArrayList;
import java.util.List;

import com.sl.bean.GoodStudent;
import com.sl.bean.Student;

public class Demo6_GenericWildcard {

	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();		//? means wildcard, Object
		
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("alice", 12));
		
		ArrayList<GoodStudent> list2 = new ArrayList<>();
		list2.add(new GoodStudent("bob", 13));
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
