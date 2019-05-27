package com.sl.enum_using_enum;

public class Demo {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		Week3 w = Week3.TUE;
		switch (w) {
		case MON:
			System.out.println("it's monday, time to work!!!");
			break;
		case TUE:
			System.out.println("it's TUESday, time to work!!!");
			break;
		case WED:
			System.out.println("it's WEDNESday, time to work!!!");
			break;
		default:
			break;
		}
	}

	private static void demo3() {
		Week3 mon = Week3.MON;
		System.out.println(mon);
		mon.show();
	}

	private static void demo2() {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
	
		System.out.println(mon);
		System.out.println(mon.getName());
		System.out.println(tue.getName());
		System.out.println(wed.getName());
	}

	private static void demo1() {
		Week mon = Week.MON;
		Week tue = Week.TUE;
		Week wed = Week.WED;
		System.out.println(mon);
		System.out.println(tue);
		System.out.println(wed);
	}

}
