package com.sl.file;

import java.io.File;
import java.util.Scanner;

public class Demo1_File {

	public static void main(String[] args) {
//		File f = new File("E:\\BaiduNetdiskDownload\\Java basic\\day19\\video");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();			//E:\BaiduNetdiskDownload\Java basic\day19\video
		sc.close();
		File f = new File(s);
		System.out.println(f.exists());		//true
		File f1 = new File("E:\\BaiduNetdiskDownload\\Java basic\\day19\\video", "001_今日内容.avi");
		System.out.println(f1.exists());
		File f2 =new File(f, "001_今日内容.avi");
		System.out.println(f2.exists());
		File f3 = new File("xxx.txt");
		System.out.println(f3.exists()); 			//relative path
	}

}
