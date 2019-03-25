package com.sl.test;

import java.io.File;
import java.util.Scanner;

public class Test1_DirLength {

	public static void main(String[] args) {
		System.out.println(getDirLength(getDir()));
	}
	
	public static File getDir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the directory path:");
		while(true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if(!dir.exists())
				System.out.println("path does not exists, please re-enter:");
			else if(dir.isFile()) 
				System.out.println("path is a file, please re-enter:");
			else
				return dir;
		}
	}
	
	public static long getDirLength(File dir) {
		long res = 0;
		File[] subfiles = dir.listFiles();
		for (File file : subfiles) {
			if(file.isFile())
				res += file.length();
			else
				res += getDirLength(file);
		}
		return res;
	}
}
