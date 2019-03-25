package com.sl.file;

import java.io.File;

public class Demo3_RenameAndDelete {

	public static void main(String[] args) {
//		demo1();
		demo2();
		
	}

	private static void demo2() {
		File f1 = new File("yyy.txt");
		System.out.println(f1.delete());
		File f2 = new File("aaa.txt");
		System.out.println(f2.delete());
		File f3 = new File("aaa");
		System.out.println(f3.delete());		//false, folder is not empty
		File f4 = new File("aaa\\ooo.txt");
		System.out.println(f4.delete());		//true
	}

	private static void demo1() {
		File f1 = new File("xxx.txt");
		File f2 = new File("ooo.txt");
		System.out.println(f1.renameTo(f2));
		File f3 = new File("aaa\\ooo.txt");
		System.out.println(f2.renameTo(f3));
	}

}
