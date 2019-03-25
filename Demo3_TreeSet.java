package com.sl.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.sl.bean.Person;

public class Demo3_TreeSet {

	public static void main(String[] args) {
//		demo1();
		demo2();
//		demo3();
	}

	private static void demo3() {
		TreeSet<Person> ts = new TreeSet<>(new compare());
		ts.add(new Person("alice", 12));
		ts.add(new Person("ab", 12));
		ts.add(new Person("bob", 13));
		ts.add(new Person("cathy", 14));
		ts.add(new Person("dwayne", 15));
		System.out.println(ts);
	}

	private static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("alice", 16));
		ts.add(new Person("alice", 16));
		ts.add(new Person("bob", 13));
		ts.add(new Person("cathy", 14));
		ts.add(new Person("dwayne", 15));
		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		System.out.println(ts);
	}

}

//base on the length of name of Person to decide the order of store
class compare implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		String s1 = p1.getName();
		String s2 = p2.getName();
		int length = s1.length() - s2.length();
		return length == 0 ? s1.compareTo(s2) : length;
	}
	
}