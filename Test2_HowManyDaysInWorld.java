package com.sl.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2_HowManyDaysInWorld {

	public static void main(String[] args) throws ParseException {
		String birthDay = "1996/03/26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date d = sdf.parse(birthDay);
		Date d1 = new Date();
		System.out.println((d1.getTime() - d.getTime()) / 1000 / 60 / 60 / 24);
	}

}
