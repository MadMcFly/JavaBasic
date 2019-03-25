package com.sl.set;

import java.util.HashSet;
import java.util.Iterator;

import com.sl.bean.Person;

public class Demo1_HashSet {

	public static void main(String[] args) {
//		demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("alice", 12));
		hs.add(new Person("alice", 12));
		hs.add(new Person("bob", 13));
		hs.add(new Person("bob", 13));
		hs.add(new Person("alice", 12));
		hs.add(new Person("alice", 12));
								
								//before override equals() and hashcode()
								//all elements are added in the HashSet
								//after override equals() and hashcode()
								//equals() only cares name and age
								//hashcode() returns certain int 10
								//then equals() is called 5 times
		
								//rewrite hashcode() method
								//use alt+shift+s then choose h
								//equals() is called 4 times
		System.out.println(hs);
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");

		System.out.println(hs);				//may out of order
											//toString() is override
		System.out.println(b1);				//true
		System.out.println(b2);				//false
		
		for (String string : hs) {			//foreach is based on Iterator
			System.out.println(string);
		}
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
