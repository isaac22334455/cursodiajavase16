package semana1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) throws IOException 
	{
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		Socket socket = null;
		
		try
		{
			
			socket = new Socket("127.0.0.2",5432);
			
			 oos = new ObjectOutputStream(socket.getOutputStream());
			 ois= new ObjectInputStream(socket.getInputStream());
			
			 
			 oos.writeObject("elian");
			 
			 String ret = (String) ois.readObject();
			 System.out.println(ret);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(oos!=null) oos.close();
			if(ois!=null) ois.close();
			if(socket != null) socket.close();
		}

	}

}
