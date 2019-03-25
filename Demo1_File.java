package com.sl.file;

import java.io.File;

public class Demo1_File {

	public static void main(String[] args) {
		File f = new File("E:\\BaiduNetdiskDownload\\Java basic\\day19\\video");
		System.out.println(f.exists());
		File f1 = new File("E:\\BaiduNetdiskDownload\\Java basic\\day19\\video", "001_今日内容.avi");
		System.out.println(f1.exists());
		File f2 =new File(f, "001_今日内容.avi");
		System.out.println(f2.exists());
		File f3 = new File("xxx.txt");
		System.out.println(f3.exists()); 			//relative path
	}

}
