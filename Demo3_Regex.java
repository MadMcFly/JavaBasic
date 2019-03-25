package com.sl.regex;

public class Demo3_Regex {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
//		demo6();
		String regex = "\\W";					//one not "word" char
												//[^a-zA-z_0-9]
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("*".matches(regex));	
		System.out.println("Z".matches(regex));
	}
	private static void demo6() {
		String regex = "\\w";					//one "word" char
												//[a-zA-z_0-9]
		System.out.println(" ".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("*".matches(regex));	
		System.out.println("Z".matches(regex));
	}
	private static void demo5() {
		String regex = "\\S";					//one not "space"
		System.out.println(" ".matches(regex));
		System.out.println("ac".matches(regex));//this is not one char
		System.out.println("	".matches(regex));	//one tab
		System.out.println("a".matches(regex));
	}
	private static void demo4() {
		String regex = "\\s";					//one "space" char
												//space, \t\r\n\f\x0B
		System.out.println(" ".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("	".matches(regex));	//one tab
		System.out.println("    ".matches(regex));	//four spaces FALSE!!
	}
	private static void demo3() {
		String regex = "\\D";					//one not number
		System.out.println("a".matches(regex));
		System.out.println("5".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void demo2() {
		String regex = "\\d";					//one number
		System.out.println("a".matches(regex));
		System.out.println("5".matches(regex));
		System.out.println("0".matches(regex));
	}

	private static void demo1() {
		String regex = ".";						//one char
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
		
		regex = "..";							//two char
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}

}
