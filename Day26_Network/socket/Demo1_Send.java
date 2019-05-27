package com.sl.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo1_Send {

	public static void main(String[] args) throws Exception {
		String s = "alice...";
		
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = 
				new DatagramPacket(s.getBytes(), s.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
		socket.send(packet);
		
		socket.close();
	}

}
