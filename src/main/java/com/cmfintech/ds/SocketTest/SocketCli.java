package com.cmfintech.ds.SocketTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketCli {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host="127.0.0.1";
		int port=5666;
		
		Socket client=new Socket(host, port);
		DataOutputStream out=new DataOutputStream(client.getOutputStream());
		out.writeUTF("来自客户端的问候");
		
		DataInputStream in=new DataInputStream(client.getInputStream());
		System.out.println("服务端的反馈："+in.readUTF());
		
		client.setSoTimeout(20000);
		client.close();
		
	}
}