package com.sl.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferedStream {

	public static void main(String[] args) throws IOException {
		/*FileInputStream fis = new FileInputStream("sunset.png");
		FileOutputStream fos = new FileOutputStream("copy2.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);*/
		
//		demo1();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sunset.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.png"));
	
		int b = 0;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bos.flush(); 			//refresh buffer, complete writing to hard disk
		bis.close();
		bos.close();			//automatically call flush(), then terminate the stream
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sunset.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.png"));
	
		int b = 0;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	} 

}
