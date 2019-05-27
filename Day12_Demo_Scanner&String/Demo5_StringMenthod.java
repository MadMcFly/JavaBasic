package com.sl.string;

public class Demo5_StringMenthod {

	public static void main(String[] args) {
//		demo1();

//		demo2();
//		demo3();
		String s = "bob&alice";
		String s1 = s.substring(4);
		System.out.println(s1);
		String s2 = s.substring(0, 3);		//dosen't include the end index!!!!
		System.out.println(s2);
	}

	private static void demo3() {
		String s = "iamhappy";
		int index1 = s.indexOf('a');
		int index2 = s.indexOf('a', 2);			//from index = 2, first 'a''s location
		System.out.println(index1 + "..." + index2);
		int index3 = s.lastIndexOf('a');		//last index
		int index4 = s.lastIndexOf('a', 3);		//last index from 3 to start
		System.out.println(index3 + "..." + index4);
	}

	private static void demo2() {
		String s = "happy";
		int index1 = s.indexOf(97);
		int index2 = s.indexOf('a');
		int index3 = s.indexOf('z');			//return -1, if no such index
		System.out.println(index1 +"..." + index2 + "..." + index3);
		
		int index4 = s.indexOf("pp");
		int index5 = s.indexOf("ay");
		System.out.println(index4 + "..." + index5);
	}

	private static void demo1() {
		int[] arr = {1,2,3};
		System.out.println(arr.length); 		//in array, length is a member var
		String s = "abc";
		System.out.println(s.length()); 		//in String, length is a member method
		char c1 = s.charAt(0);
		System.out.println(c1);
		char c2 = s.charAt(3);					//java.lang.StringIndexOutOfBoundsException
	}

}
