package com.sl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3_DirCopy {

	public static void main(String[] args) throws IOException {
		File src = Test1_DirLength.getDir();
		File dest = Test1_DirLength.getDir();
		if(!src.equals(dest))
			copy(src, dest);
		else
			System.out.println("source is same as destination!");
	}

	public static void copy(File src, File dest) throws IOException {
		File dir = new File(dest, src.getName());
		dir.mkdir();
		
		File[] subfiles = src.listFiles();
		for (File file : subfiles) {
			if(file.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dir, file.getName())));
				
				int i;
				while((i = bis.read()) != -1) {
					bos.write(i);
				}
				
				bis.close();
				bos.close();
			}else {
				copy(file, dir);
			}
		}
	}

}
