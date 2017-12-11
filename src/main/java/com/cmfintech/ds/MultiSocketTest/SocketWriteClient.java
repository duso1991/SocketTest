package com.cmfintech.ds.MultiSocketTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
/**
 * 
  * @Title: SocketWriteClient.java
  * @Description:套接字客户端写线程
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年12月11日 上午11:08:10
  * @version V1.0
 */
public class SocketWriteClient  extends Thread{
	
	 private Socket socket;
	 
		public SocketWriteClient(Socket socket) {
			this.socket=socket;
		}
		
		
		public void run() {
			try {
				DataOutputStream out=new DataOutputStream(socket.getOutputStream());
				out.writeUTF("来自客户端最诚挚的问候");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}
}