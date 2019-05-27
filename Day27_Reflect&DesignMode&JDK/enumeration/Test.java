package com.sl.enumeration;

public class Test {

	public static void main(String[] args) {
//		demo1();
//		demo2();		
		Week3 mon = Week3.MON;
		Week3 tue = Week3.TUE;
		Week3 wed = Week3.WED;
		
		mon.show();
		tue.show();
		wed.show();
	}

	private static void demo2() {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
		
		System.out.println(mon.getName());
		System.out.println(tue.getName());
		System.out.println(wed.getName());
	}

	private static void demo1() {
		Week mon = Week.MON;
		Week mon1 = Week.MON;
		Week tue = Week.TUE;
		Week wed = Week.WED;
		
//		Week.MON = Week.TUE;				//final can't be changed
		
		System.out.println(mon.equals(mon1));
		System.out.println(mon.equals(tue));
	}

}
