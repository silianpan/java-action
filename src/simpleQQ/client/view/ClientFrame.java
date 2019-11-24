package simpleQQ.client.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JList;

public class ClientFrame extends JFrame implements Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextArea textAreaMsg = new JTextArea();
	JTextArea textAreaSend = new JTextArea();
	JButton butConnect = new JButton("连接服务器");
	JLabel lableInfo = new JLabel("");
	JButton butSend = new JButton("发送");
	JTextField textFieldMyName = new JTextField();
	JList listAllfriends = new JList();
	
	private DataInputStream in;
	private DataOutputStream out;
	private String myClientName;
	

	public ClientFrame() {
		textFieldMyName.setBounds(272, 39, 96, 23);
		textFieldMyName.setColumns(10);
		
		this.setSize(422,518);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textAreaMsg.setBounds(10, 38, 252, 285);
		getContentPane().add(textAreaMsg);

		textAreaSend.setBounds(10, 333, 252, 96);
		getContentPane().add(textAreaSend);

		butConnect.setBounds(275, 10, 93, 23);
		getContentPane().add(butConnect);

		lableInfo.setBounds(10, 5, 198, 23);
		getContentPane().add(lableInfo);
		
		butSend.setBounds(169, 439, 93, 23);
		getContentPane().add(butSend);
		getContentPane().add(textFieldMyName);
		
		listAllfriends.setBounds(272, 72, 112, 350);
		getContentPane().add(listAllfriends);
		
		// 连接服务器事件
		butConnect.addActionListener(new ButActionListener());
		// 发送消息按钮事件
		butSend.addActionListener(new ButActionListener());
		// JList点击事件
		listAllfriends.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String str = (String) listAllfriends.getSelectedValue();
				if (str.isEmpty()){
					JOptionPane.showMessageDialog(ClientFrame.this, "请选择好友", "系统提示", JOptionPane.WARNING_MESSAGE);
					return;
				}
				try {
					out.writeUTF("#myfriend#" + str);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
	}
	
	public void connectServer(){
		
		final String ADDRESS = "127.0.0.1";	// 服务端IP地址
		final int PORT = 6888;				// 服务端端口号
		try {
			// 1. 创建一个Socket对象，用于连接服务器
			Socket socket = new Socket(ADDRESS, PORT);
			
			// 2. 获取输入流和输出流
			out = new DataOutputStream(socket.getOutputStream());	// 输出流，用于向服务端发送消息
			in = new DataInputStream(socket.getInputStream());	// 输入流，用于接收服务端消息
			
			// 3. 向服务端发送自己的名字
			String myName = textFieldMyName.getText().trim();
			
			if (myName.isEmpty()){
				JOptionPane.showMessageDialog(this, "你的昵称为空，请输入你的昵称", "系统提示", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			this.myClientName = myName;
			out.writeUTF("#clientname#" + myName);
			lableInfo.setText("已经连接服务器");
		} catch (Exception e) {
			lableInfo.setText("连接服务器失败！");
		}
	}
	
	class ButActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if ( e.getSource() == butConnect ){
				connectServer();
				new Thread( ClientFrame.this ).start();
				
			}else if (e.getSource() == butSend){
				String msg = textAreaSend.getText();
				textAreaMsg.append("我说：" + msg + "\n");
				textAreaSend.setText(null);
				try {
					out.writeUTF(myClientName + "#说：" + msg);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}
		
	}

	@Override
	public void run() {
		String allFriendsFlg = "@friends#";
		
		while(true){
			try {
				
				String serverMsg = in.readUTF(); // 接收服务端发送的消息 
				if ( serverMsg.contains(allFriendsFlg) ){
					String friendStr = serverMsg.substring(allFriendsFlg.length());
					String[] friends = friendStr.split("#");
					this.listAllfriends.setListData(friends);
				}else{
					System.out.println(serverMsg);
					String[] str = serverMsg.split("#");
					out.writeUTF("#myfriend#" + str[0]);
					textAreaMsg.append(str[0] + str[1] + "\n");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
