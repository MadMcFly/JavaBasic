package com.sl.test;

import java.io.File;

public class Test2_DirDelete {

	public static void main(String[] args) {
		dirDelete(Test1_DirLength.getDir());	//!!!No recycle bin!
	}

	public static void dirDelete(File dir) {
		File[] subfiles = dir.listFiles();
		for (File file : subfiles) {
			if(file.isFile())
				file.delete();
			else
				dirDelete(file);
		}
		dir.delete();
	}
}
