package com.cmfintech.ds.MultiSocketTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketSer  {
	
	public static void main(String[] args) throws IOException {
		 ServerSocket serverSocket=new ServerSocket(5666);
		System.out.println("端口:"+serverSocket.getLocalPort()+"启动，等待连接...");
		
		
		while (true) {
			Socket socket = serverSocket.accept();
			new SocketWriteServer(socket).start();
			new SocketReadClient(socket).start();
		}
		
		
	}
}