package com.sl.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo10_DataInputOutputStream {

	public static void main(String[] args) throws IOException {
//		demo1();
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
		dos.writeInt(997);
		dos.writeInt(998);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
		int x;
		while((x = dis.readInt()) != -1) {
			System.out.println(x);
		}
		dis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("h.txt");
		fos.write(97);			//'a', 97
		fos.write(997);			//unknown char, 229, last 8 digits of int(24)
		fos.close();
		
		FileInputStream fis = new FileInputStream("h.txt");
		int x = fis.read();
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		fis.close();
	}

}
