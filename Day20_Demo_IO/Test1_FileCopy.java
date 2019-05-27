package com.sl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1_FileCopy {

	public static void main(String[] args) throws IOException {
		File f = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f.getName()));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	
	public static File getFile() {
		System.out.println("Please type the absolute path of the file you want to copy:");
		Scanner sc = new Scanner(System.in);
		
				
		while(true) {
		File f = new File(sc.nextLine());
		if(!f.exists()) 
			System.out.println("file path doesn't exists, please re-enter:");
		else if(f.isDirectory())
			System.out.println("path is a directory, not a file, please re-enter:");
		else
			return f;
		}
	}
}
