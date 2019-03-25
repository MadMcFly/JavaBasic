package com.sl.otherclass;

import java.util.Calendar;

public class Demo8_Calendar {

	public static void main(String[] args) {
//		demo1();
		Calendar c = Calendar.getInstance();
//		c.add(Calendar.YEAR, 1);
		c.set(Calendar.MONTH, 11);		//actual month = 11 + 1!!!!
		c.set(2000, 0, 1);
		System.out.println(c.get(Calendar.YEAR) + " year " + getNumFormat((c.get(Calendar.MONTH) + 1))
		+ " month " + getNumFormat(c.get(Calendar.DAY_OF_MONTH)) + " day " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));		//actual month - 1!!!
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.YEAR) + " year " + getNumFormat((c.get(Calendar.MONTH) + 1))
				+ " month " + getNumFormat(c.get(Calendar.DAY_OF_MONTH)) + " day " + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	public static String getWeek(int num) {
		String[] arr = {"", "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday"};
		return arr[num];
	}
	
	public static String getNumFormat(int num) {
		return num > 9 ? "" + num : "0" + num;
	}
}
