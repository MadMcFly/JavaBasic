package com.sl.otherio;

import java.io.PrintStream;

import com.sl.bean.Person;

public class Demo5_PrintStream {

	public static void main(String[] args) {
		System.out.println("aaa");
		
		PrintStream ps = System.out;
		ps.println("aaa");
		ps.println(97);
		ps.write(97);
		ps.print("\r\n");
		
		Person p1 = new Person("alice", 12);
		Person p2 = null;
		ps.println(p1);
		ps.println(p2);
		ps.close();
	}

}
