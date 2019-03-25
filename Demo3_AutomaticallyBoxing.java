package com.sl.warpclass;

public class Demo3_AutomaticallyBoxing {

	public static void main(String[] args) {
		/*int x = 100;
		Integer i = new Integer(x);		//boxing
		int y = i.intValue();			//unboxing
		System.out.println(x + "..." + y);*/

		Integer i = 100;				//automatically boxing
		int z = i + 100;				//automatically unboxing
		System.out.println(z);
		
		Integer i1 = null;				//null can't auto boxing
//		z = i1 + 100;					//java.lang.NullPointerException
	}

}
