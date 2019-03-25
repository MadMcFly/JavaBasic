package com.sl.test;

import java.io.File;
import java.util.Scanner;

public class Test4_GetJavaFile {

	public static void main(String[] args) {
		output(getDir());
	}
	
	public static File getDir() {
		System.out.println("Please input directory name:");
		String filename;
		Scanner sc = new Scanner(System.in);
		while(true) {
			filename = sc.nextLine();
			File dir = new File(filename);
			if(!dir.isDirectory()) {
				System.out.println("Invalid input, please re-enter:");
			}else {
				return dir;
			}
		}
	}
	
	public static void output(File dir) {
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()) {
				output(file);
			}
		}
	}
}
