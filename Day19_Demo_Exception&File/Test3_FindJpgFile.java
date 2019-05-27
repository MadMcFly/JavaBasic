package com.sl.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test3_FindJpgFile {

	public static void main(String[] args) {
		File f = new File("E:\\");
//		demo1(f);
//		demo2(f);
		demo3(f);
	}

	private static void demo3(File f) {
		String[] arr1 = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File f = new File(dir, name);
				return f.getName().endsWith("txt") ? true : false;
			}
		});
		String[] arr2 = f.list();
		for(String s : arr2) {
			System.out.println(s);
		}
		for (String string : arr1) {
			System.out.println(string);
		}
	}

	private static void demo2(File f) {
		File[] arr2 = f.listFiles();
		for (File file : arr2) {
			if(file.isFile() && file.getName().endsWith("txt")) {
				System.out.println(file); 			//can further go in
													//use recursion
			}
		}
	}

	private static void demo1(File f) {
		System.out.println(f.exists());
		String[] arr = f.list();
		for (String string : arr) {
			if(string.endsWith("txt")) {
				System.out.println(string);
			}
		}
	}

}
