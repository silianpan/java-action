package simpleQQ.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务端入口程序
 * @author liupan
 *
 */
public class Server {
	
	public static void main(String args[]){
		
		final int PORT = 6888;
		List<Friend> friends = new ArrayList<Friend>();
		
		try {
			// 1. 创建ServerSocket对象，用于监听客户端连接
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while( true ){
				// 2. 监听
				Socket client = serverSocket.accept();
				
				// 3. 对每一个客户端创建一个线程，用于资源独立
				new Thread(new ServerThread(client, friends)).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
