package com.sl.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6666);
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		socket.receive(packet);
		
		byte arr[] = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(arr, 0, len));
		System.out.println(packet.getAddress().getHostAddress());
		System.out.println(packet.getPort());
		socket.close();
	}

}
