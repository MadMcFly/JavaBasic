package com.sl.map;

import java.util.HashMap;

import com.sl.bean.Student;

public class Demo5_StudentAsKey {

	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("alice", 12), "new york");
		hm.put(new Student("bob", 13), "boston");
		hm.put(new Student("cathy", 14), "miami");
		String s = hm.put(new Student("alice", 12), "LA");
		//need to override Student class hashcode() and equals()
		
		System.out.println(s); 		
		System.out.println(hm);
	}

}
