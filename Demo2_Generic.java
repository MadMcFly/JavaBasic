package com.sl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.sl.bean.BaseStudent;
import com.sl.bean.Student;

public class Demo2_Generic {

	public static void main(String[] args) {
//		demo1();
		TreeSet<Student> ts1 = new TreeSet<>(new compare());
		ts1.add(new Student("alice", 12));
		ts1.add(new Student("bob", 13));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new compare());	//? super E
		ts2.add(new BaseStudent("cathy", 15));
		ts2.add(new BaseStudent("siyuan", 10));
		
		System.out.println(ts1);
		System.out.println(ts2);
	}

	private static void demo1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("alice", 12));
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("bob", 13));
		
		list1.addAll(list2);		//? extends E
		System.out.println(list1);
//		list2.addAll(list1);
	}

}

class compare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int num = o1.getAge() - o2.getAge();
		return num == 0 ? 1 : num;
	}
	
}