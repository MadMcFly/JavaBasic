package com.sl.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
//		demo1();
//		demo2();	//Date obj to String
		demo3();	//String to Date obj
	}

	private static void demo3() throws ParseException {
		String s = "2008/08/08 08:08:08";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = sdf1.parse(s);
		System.out.println(d);
	}

	private static void demo2() {
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d = new Date();
		System.out.println(sdf.format(d));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf1.format(d));
	}

	private static void demo1() {
		//		DateFormat df = new DateFormat();	//DateFormat is abstract
		DateFormat df = DateFormat.getDateInstance();
		//df = new SimpleDateFormat();
	}

}
