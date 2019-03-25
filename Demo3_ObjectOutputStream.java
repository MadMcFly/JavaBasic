package com.sl.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.sl.bean.Person;

public class Demo3_ObjectOutputStream {

	public static void main(String[] args) throws IOException, IOException {
//		demo1();
		Person p1 = new Person("alice", 12);
		Person p2 = new Person("bob", 13);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		oos.writeObject(list);
	}

	private static void demo1() throws IOException, FileNotFoundException {
		Person p1 = new Person("alice", 12);
		Person p2 = new Person("bob", 13);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
		oos.writeObject(p1);
		oos.writeObject(p2);
	}

}
