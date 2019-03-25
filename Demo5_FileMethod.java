package com.sl.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

	public static void main(String[] args) {
		File f1 = new File("xxx.txt");
		File f2 = new File("E:\\Java\\eclipse-workspace\\Day19_Demo_Exception&File\\xxx.txt");
//		demo1(f1, f2);
//		demo2(f1, f2);
//		demo3(f1);
		demo4();
	}

	private static void demo4() {
		File f3 = new File("E:\\BaiduNetdiskDownload\\Java basic\\day19\\video");
		String[] arr1 = f3.list();
		for (String string : arr1) {
			System.out.println(string);
		}
		File[] arr2 = f3.listFiles();
		for (File file : arr2) {
			System.out.println(file);
		}
	}

	private static void demo3(File f1) {
		long l = f1.lastModified();
		System.out.println(l);
		Date d = new Date(l);
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MM, dd HH:mm:ss");
		System.out.println(sdf.format(d));
	}

	private static void demo2(File f1, File f2) {
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f1.length()); 			//number of bytes
	}

	private static void demo1(File f1, File f2) {
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f1.getPath());			//path of constructor
		System.out.println(f2.getPath());			//path of constructor
	}

}
