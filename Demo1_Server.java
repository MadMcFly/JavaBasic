package com.sl.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_Server {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		os.write("This is Google search!".getBytes());
		
		byte[] b = new byte[1024];
		int len;
		len = is.read(b);
		System.out.println(new String(b, 0, len));
		
		socket.close();
	}

}
