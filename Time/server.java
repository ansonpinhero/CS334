import java.io.*;
import java.net.*;
class server{
	DatagramSocket ds;
	DatagramPacket dp;
	byte[] recevpackt;
	BufferedReader in;
	InetAddress ip;
	int port;
	String str;
	public server() 
	{
		 try{
 			ds=new DatagramSocket(1456);
 			
 			recevpackt=new byte[100];
 			dp=new DatagramPacket(recevpackt,recevpackt.length);
 			ds.receive(dp);
			String data=new String(dp.getData());
			System.out.print("Client :"+data);
			System.exit(0);	


    		}
		catch(Exception e)
 		{
 			System.out.println("The Error is "+e);
 		}


	}

	public static void main(String args[])throws IOException
	{
		server obj=new server();  
	}

}

