package com.sl.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Client {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("127.0.0.1", 12345);
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		byte[] b = new byte[1024];
		int len;
		len = is.read(b);
		System.out.println(new String(b, 0, len));
		
		os.write("Where am I?".getBytes());
		
		socket.close();
	}

}
