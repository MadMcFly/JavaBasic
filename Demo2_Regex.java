package com.sl.regex;

public class Demo2_Regex {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
//		demo6();
		String regex = "[a-z&&[^m-p]]";			//think as minus [a-lq-z]
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("p".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo6() {
		String regex = "[a-z&&[abc]]";			//think as minus
		System.out.println("a".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";			//intersection
		System.out.println("d".matches(regex));
		System.out.println("e".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";			//still union
		System.out.println("a".matches(regex));
		System.out.println("p".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo3() {
		String regex = "[a-zA-Z]";				//union
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

	private static void demo2() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
		System.out.println("54".matches(regex));	//[] represents one char
	}

	private static void demo1() {
		String regex = "[abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("1".matches(regex));
		System.out.println("%".matches(regex));
	}

}
