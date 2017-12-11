package com.cmfintech.ds.MultiSocketTest;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 
  * @Title: SocketReadClient.java
  * @Description:套接字客户端读线程
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月11日 上午11:00:29
  * @version V1.0
 */

public class SocketReadClient  extends  Thread {
	 private Socket socket;
	 
	public SocketReadClient(Socket socket) {
		this.socket=socket;
	}
	
	
	public void run() {
		try {
			DataInputStream in=new DataInputStream(socket.getInputStream());
			System.out.println("来自服务端消息:\n");
			System.out.println(in.readUTF());
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}