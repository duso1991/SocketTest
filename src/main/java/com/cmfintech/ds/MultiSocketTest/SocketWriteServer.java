package com.cmfintech.ds.MultiSocketTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/**
 * 
  * @Title: SocketReadServer.java
  * @Description:套接字服务端写线程
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月11日 上午11:08:31
  * @version V1.0
 */

public class SocketWriteServer extends Thread {
private Socket socket;
	
	public SocketWriteServer(Socket socket) {
		this.socket=socket;
	}
	
	public void run() {
		try {
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			out.writeUTF("欢迎你的连接");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}