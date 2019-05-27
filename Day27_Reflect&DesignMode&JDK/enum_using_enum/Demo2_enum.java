package com.sl.enum_using_enum;

public class Demo2_enum {

	public static void main(String[] args) {
		Week2 w1 = Week2.MON;
		Week2 w2 = Week2.TUE;
		Week2 w3 = Week2.WED;
		
//		demo1(w1, w2, w3);
		
//		demo2(w1);
		
		Week2 w = Week2.valueOf(Week2.class, "TUE");
		System.out.println(w);
		
		Week2[] arr = Week2.values();
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}
	}

	private static void demo2(Week2 w1) {
		System.out.println(w1.name());
		System.out.println(w1.toString());					//can be override
	}

	private static void demo1(Week2 w1, Week2 w2, Week2 w3) {
		System.out.println(w1.ordinal());
		System.out.println(w3.ordinal());
		System.out.println(w2.compareTo(w1)); 				//w2.ordinal() - w1.ordinal()
	}

}
