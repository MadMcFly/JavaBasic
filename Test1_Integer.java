package com.sl.warpclass;

public class Test1_Integer {

	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);			//false, different obj
		System.out.println(i1.equals(i2));		//override in class Integer
												//true
		System.out.println("-------------");
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);			//true????
												//in range with byte number
												//auto box will use same array
												//so addr are the same
		System.out.println(i3.equals(i4));		//false
		System.out.println("-------------");

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);			//false
		System.out.println(i5.equals(i6));		//false
	}

}
