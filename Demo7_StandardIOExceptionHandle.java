package com.sl.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_StandardIOExceptionHandle {

	public static void main(String[] args) throws Exception {
//		demo1();
		try(
			FileInputStream fis = new FileInputStream("aaa.txt");
			FileOutputStream fos = new FileOutputStream("bbb.txt");
			MyClose mc = new MyClose();
		){
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			System.out.println("After this {}...");
		}
	}

	private static void demo1() throws FileNotFoundException, IOException { //JDK1.6
		FileInputStream fis = null;					//can't be declared inside {}
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("aaa.txt");	//then it will be local
			fos = new FileOutputStream("bbb.txt");
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			try {
				if(fis != null) 					//close as many as possible
					fis.close();
			}finally {
				if(fos != null)
					fos.close();
			}
		}
	}

}

class MyClose implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("I'm closed automatically...");
	}
	
}