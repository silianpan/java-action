package simpleQQ.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * DataInputStream和DataOutputStream
 * 	不限制数据类型，整形，字符串，字符，Double
 * FileInputStream和FileOutputStream
 * 	文本，字节流
 * BufferedInputStream和BufferedOutputStream
 * 	带缓冲输入和输出流，字节
 * ZipOutputStream和ZipInputStream
 * 	压缩流，用于压缩解压缩，软件：压缩解压缩
 * @author liupan
 *
 */
public class ServerThread implements Runnable {
	
	private DataInputStream in;		// 数据输入流，用于接收客户端消息
	private DataOutputStream out;	// 数据输出流，用于发送消息给客户端
	private List<Friend> friends;
	private Friend 		myFriend;	// 保存我要通信的好友
	
	
	public ServerThread(Socket client, List<Friend> friends){
		// 初始化客户端输入流和输出流
		try {
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			this.friends = friends;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while( true ){
			try {
				// 定义消息格式
				String clientNameFlg = "#clientname#";
				String allFriendsFlg = "@friends#";
				String myfriend = "#myfriend#";
				
				// 接收客户端消息
				String clientMsg = in.readUTF();
				// 客户端发送的是自己的昵称
				if (clientMsg.contains(clientNameFlg)){
					
					String clientName = clientMsg.substring(clientNameFlg.length());
					Friend my = new Friend(this, clientName);
					friends.add(my);
					
					// 向客户端发送所有好友
					// 获取所有好友
					StringBuffer strBuf = new StringBuffer(allFriendsFlg);
					for ( Friend f : friends ){
						strBuf.append(f.getName()).append("#");
					}
					
					// 向所有好友发送所有好友
					for ( Friend f : friends ){
						f.getServerThread().getOut().writeUTF(strBuf.toString());
					}
				}else if (clientMsg.contains(myfriend)){
					String myfriendName = clientMsg.substring(myfriend.length());
					for ( Friend f : friends ){
						if (myfriendName.equals(f.getName())){
							this.myFriend = f;
							break;
						}
					}
				}else{
					if ( this.myFriend != null ){
						this.myFriend.getServerThread().getOut().writeUTF(clientMsg);
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public DataInputStream getIn() {
		return in;
	}

	public void setIn(DataInputStream in) {
		this.in = in;
	}

	public DataOutputStream getOut() {
		return out;
	}

	public void setOut(DataOutputStream out) {
		this.out = out;
	}
	
}
