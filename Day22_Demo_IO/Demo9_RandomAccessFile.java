package com.sl.otherio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo9_RandomAccessFile {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("g.txt", "rw");
		raf.write(97);
		raf.seek(10);
		raf.write(98);
		raf.seek(0);
		int x = raf.read();
		raf.seek(10);
		int y = raf.read();
		System.out.println(x);
		System.out.println(y);
	}

}
