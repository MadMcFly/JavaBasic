package com.sl.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.sl.bean.Student;

public class Demo7_TreeMap {

	public static void main(String[] args) {
//		demo1();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num = o1.compareTo(o2);
				return num;
			}
		});
		tm.put(new Student("alice", 12), "new york");
		tm.put(new Student("bob", 13), "boston");
		tm.put(new Student("dwayne", 15), "LA");
		tm.put(new Student("cathy", 14), "miami");
		tm.put(new Student("alice", 12), "hempstead");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<>();
		//Student implements Comparable interface 
		//override compareTo() method
		tm.put(new Student("alice", 12), "new york");	//ClassCastException
		tm.put(new Student("bob", 13), "boston");
		tm.put(new Student("dwayne", 15), "LA");
		tm.put(new Student("cathy", 14), "miami");
		System.out.println(tm);
	}

}
