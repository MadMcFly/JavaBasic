package com.sl.new_feature_in_JDK5;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.sl.bean.Student;

public class Demo1_Foreach {

	public static void main(String[] args) {
//		demo1();
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("alice", 12));
		list.add(new Student("bob", 13));
		
		for (Student student : list) {
			System.out.println(student);
		}
	}

	private static void demo1() {
		int[] arr = {11, 22, 33, 44, 55};
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
