import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Connection 
{
	private int port = 0;
	private ServerSocket ss = null;
	private Thread th = null;
	
	public Connection(int port) 
	{
		this.setPort(port);
		
		// TODO Auto-generated constructor stub
	}
	
	public void LaunchServerTcp () throws IOException
	{
		this.ss = new ServerSocket(port);
		while (true)
		{
			Socket client = ss.accept();
			th = new Thread(new Listener(client));
			th.start();
			
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public static void main(String[] args) throws IOException
	{
		Connection connect = null;
		int port = Integer.parseInt(args[0]);
		connect = new Connection(port);
		connect.LaunchServerTcp();
	}
	
}
