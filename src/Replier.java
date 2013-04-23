import java.io.IOException;
import java.net.Socket;


public class Replier 
{
	private Socket client = null;
	
	public Replier(Socket client) 
	{
		// TODO Auto-generated constructor stub
		this.client = client;
	}
	
	void Reply () throws IOException
	{
		this.client.getOutputStream().write("You Are Connected".getBytes());
		//client.close();
	}

}


