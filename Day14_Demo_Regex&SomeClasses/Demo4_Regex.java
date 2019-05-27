package com.sl.regex;

public class Demo4_Regex {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
		String regex = "[abc]{5,15}";			//between 5, 15 times
		System.out.println("".matches(regex));
		System.out.println("aaababababa".matches(regex));
		System.out.println("babababbababbabbbaaba".matches(regex));
		System.out.println("ab".matches(regex));
	}

	private static void demo5() {
		String regex = "[abc]{1,}";				//more than one time(s)
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}

	private static void demo4() {
		String regex = "[abc]{5}";				//exact 5 times
												//[]{} NO SPACE in BETWEEN!!
		System.out.println("".matches(regex));
		System.out.println("acbbc".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}

	private static void demo3() {
		String regex = "[abc]+";				//one to more times
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}

	private static void demo2() {
		String regex = "[abc]*";				//0 to more times
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
		System.out.println("abd".matches(regex));	//d is not in X range
	}

	private static void demo1() {
		String regex = "[abc]?";				//0 or 1 time
		System.out.println("".matches(regex));
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("ab".matches(regex));
	}

}
