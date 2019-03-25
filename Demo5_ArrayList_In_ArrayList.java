package com.sl.list;

import java.util.ArrayList;

import com.sl.bean.Student;

public class Demo5_ArrayList_In_ArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> department = new ArrayList<>();
		ArrayList<Student> major1 = new ArrayList<>();
		ArrayList<Student> major2 = new ArrayList<>();
		
		major1.add(new Student("alice", 12));
		major1.add(new Student("bob", 13));

		major2.add(new Student("cathy", 14));
		major2.add(new Student("dwayne", 15));
		
		department.add(major1);
		department.add(major2);
		
		for(ArrayList<Student> major : department) {
			for (Student student : major) {
				System.out.println(student);
			}
		}
  	}

}
