import java.io.*;
import java.net.*;
import java.util.*;
class client{
	DatagramSocket ds;
	DatagramPacket dp;
	byte[] sendpackt;
	BufferedReader in;
	InetAddress ip;
	int port;
	String str;
public client() 
{
	try{

		in=new BufferedReader(new InputStreamReader(System.in));
		ip=InetAddress.getByName("localhost");
		ds=new DatagramSocket();
		
		sendpackt =new byte[100];
		Date d = new Date();
		str = d+" ";
		sendpackt=str.getBytes();
		dp=new DatagramPacket(sendpackt,sendpackt.length,ip,1456);
		ds.send(dp);
		System.exit(0);
			
		

	}

	catch(Exception e)
 	{
 		System.out.println("The Error is "+e);
 	}


}

public static void main(String args[])throws IOException
{
	udpclient obj=new udpclient();  
}

}

