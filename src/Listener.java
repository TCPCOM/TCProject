import java.net.Socket;


public class Listener implements Runnable
{
	private Socket ss = null;
	private Replier rp = null;
	
	public Listener(Socket listener) 
	{
		// TODO Auto-generated constructor stub
		this.ss = listener;
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
	 
		setRp(new Replier(ss));
	}

	public Replier getRp() {
		return rp;
	}

	public void setRp(Replier rp) {
		this.rp = rp;
	}
	
}
