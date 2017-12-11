package com.cmfintech.ds.MultiSocketTest;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketCli {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1",5666);
		new SocketReadClient(socket).start();
		new SocketWriteClient(socket).start();
		
	}
	
}