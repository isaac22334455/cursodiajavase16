package semana1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException 
	{
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		ServerSocket servS = new ServerSocket(5432);
		Socket socket = null;
		// TODO Auto-generated method stub
		while(true)//se ejecuta infinitas beses
		{
			try
			{
				socket = servS.accept();
				
				String ip = socket.getInetAddress().toString();
				System.out.println("Se conectaron desde la ip: "+ip);
				
				 ois= new ObjectInputStream(socket.getInputStream());
				 oos = new ObjectOutputStream(socket.getOutputStream());
				 
				 String nom = ois.readObject().toString();
				 
				 long ts = System.currentTimeMillis();//tiempo de ejecusion desde que arranca hasta qye se envia el mensaje
				 String saludo = "Hola mundo ,"+nom+"("+ts+")";
				 
				 oos.writeObject(saludo);
				 System.out.println("saludo enviado");
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				if(oos!=null) oos.close();
				if(ois!=null) ois.close();
				if(socket != null) socket.close();
				System.out.println("");
			}
		}

	}

}
