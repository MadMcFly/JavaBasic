package com.sl.string;

public class Demo3_InterviewQuestions {
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		demo4();
	}

	private static void demo4() {
		String s1 = "ab";
		String s2 = "abc";			//addr of an object in constant pool
		String s3 = s1 + "c";		//using StringBuffer class to connect s1 and "c" 
									//then use toString() method, to get a new String object(where s3 is)
		System.out.println(s2 == s3);			//false
		System.out.println(s2.equals(s3));		//true
	}

	private static void demo3() {
		String s1 = "a" + "b" + "c";			//calculation of constants is done when being compiled!!!
		String s2 = "abc";
		System.out.println(s1 ==s2);			//true
		System.out.println(s1.equals(s2));
	}

	private static void demo2() {
		String s2 = new String("abc");					//this sentence will create two objects, 
														//one in constant, the other in heap
														//s2:addr in heap
		String s1 = "abc";								//s1:addr in constant pool
		System.out.println(s1 == s2);					//false
		System.out.println(s1.equals(s2));				//true
		System.out.println(s1.hashCode() + "\t" + s2.hashCode());	//equals() is true,  then hashCode() are same
	}

	private static void demo1() {
		String s1 = "abc";						//not exist, then create one in constant pool
		String s2 = "abc";						//already exist, then just use it
		System.out.println(s1 == s2);			//true
		System.out.println(s1.equals(s2));
	}
}
