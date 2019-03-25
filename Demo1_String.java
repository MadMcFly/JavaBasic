package com.sl.string;

public class Demo1_String {

	public static void main(String[] args) {
		String str = "abc";			//str to object "abc"
		System.out.println(str);	//String class has override toString() method
		str = "def";				//str to new object "def", "abc" is junk
		System.out.println(str);
	}

}
