package com.sl.regex;

public class Demo1_Regex {

	public static void main(String[] args) {
		String regex = "[1-9]{4,14}";		//number, 5-15digits,
												//first can;t be 0
		System.out.println("a12354".matches(regex));
		System.out.println("12354554".matches(regex));
	}

}
