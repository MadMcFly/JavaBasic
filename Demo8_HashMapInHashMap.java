package com.sl.map;

import java.util.HashMap;

import com.sl.bean.Student;

public class Demo8_HashMapInHashMap {

	public static void main(String[] args) {
		HashMap<Student, String> ee = new HashMap<>();
		ee.put(new Student("cathy", 14), "miami");
		ee.put(new Student("alice", 12), "new york");
		ee.put(new Student("dwayne", 15), "LA");
		ee.put(new Student("bob", 13), "boston");
		
		HashMap<Student, String> ce = new HashMap<>();
		ce.put(new Student("alice1", 12), "new york1");
		ce.put(new Student("dwayne1", 15), "LA1");
		ce.put(new Student("cathy1", 14), "miami1");
		ce.put(new Student("bob1", 13), "boston1");
		
		HashMap<HashMap<Student, String>, String> school = new HashMap<>();
		school.put(ee, "EE major");
		school.put(ce, "CE major");
		
		for(HashMap<Student, String> h : school.keySet()) {
			String major = school.get(h);
			for(Student s : h.keySet()) {
				System.out.println(s + ", Major: " + major + ", addr: " + h.get(s));
			}
		}
	}

}
