package com.sl.test;

import java.io.File;

public class Test4_PrintStructure {

	public static void main(String[] args) {
		File dir = Test1_DirLength.getDir();
		dirLev(dir, 0);
	}

	public static void dirLev(File dir, int tab) {
		File[] subfiles = dir.listFiles();
		for (File file : subfiles) {
			for (int i = 0; i < tab; i++) {
				System.out.print("\t");
			}
			System.out.println(file.getName());
			if(file.isDirectory())
				dirLev(file, tab + 1);		//can't use tab++ or ++ tab!!!!
		}
	}

}
