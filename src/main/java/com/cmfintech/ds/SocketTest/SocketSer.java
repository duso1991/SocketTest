package com.cmfintech.ds.SocketTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketSer  {
	
	public static void main(String[] args) throws IOException {
		 ServerSocket serverSocket=new ServerSocket(5666);
		System.out.println("端口:"+serverSocket.getLocalPort()+"启动，等待连接...");
		Socket socket = serverSocket.accept();
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("感谢你的连接" + socket.getRemoteSocketAddress() + ":" + socket.getLocalPort());

		DataInputStream in = new DataInputStream(socket.getInputStream());
		System.out.println("客户端来信：" + in.readUTF());
		socket.setSoTimeout(20000);
		socket.close();
	}
}