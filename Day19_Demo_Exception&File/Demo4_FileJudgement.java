 package com.sl.file;

import java.io.File;
import java.io.IOException;

public class Demo4_FileJudgement {

	public static void main(String[] args) throws IOException {
		File f = new File("xxx.txt");
		f.createNewFile();
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		File f1 = new File("aaa");
		System.out.println(f1.isDirectory());
		f1.setReadable(false);				//in Windows all file can be read
		System.out.println(f1.canRead());	//true
		f.setWritable(false);
		System.out.println(f.canWrite());
		System.out.println(f1.isHidden());	//can be set in windows(not using java)
	}

}
