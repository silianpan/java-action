package simpleQQ.server;

public class Friend {
	
	private ServerThread serverThread;
	private String 	name;
	
	public Friend(ServerThread serverThread, String name){
		this.serverThread = serverThread;
		this.name = name;
	}
	
	public ServerThread getServerThread() {
		return serverThread;
	}
	
	public void setServerThread(ServerThread serverThread) {
		this.serverThread = serverThread;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
