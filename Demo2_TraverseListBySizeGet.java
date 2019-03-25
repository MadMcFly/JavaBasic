package com.sl.list;

import java.util.ArrayList;
import java.util.List;

import com.sl.bean.Student;

public class Demo2_TraverseListBySizeGet {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("alice", 12));
		list.add(new Student("bob", 13));
		
		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

}
