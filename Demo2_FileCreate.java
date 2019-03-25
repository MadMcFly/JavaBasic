package com.sl.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileCreate {

	public static void main(String[] args) throws IOException {	//might IOExc
		File f1 = new File("yyy.txt");
		System.out.println(f1.createNewFile());		//first time:true
													//after:false
		File f2 = new File("aaa.txt");
		System.out.println(f2.mkdir());
		File f3 = new File("aaa\\bbb\\a.txt");
		System.out.println(f3.mkdirs()); 			//a.txt will also be folder
	}

}
