package com.cursodia.java16.semana4.archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class LectorArchivo {

	public static void main(String[] args)
	{
		
		String p ="Files/sumas.txt";
		Path ruta = Paths.get(p);
		if(Files.exists(ruta))
		{
			try {//intento
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(p),"utf-8"));
				String linea = null;
				int i =0;
				while((linea= br.readLine())!=null)//null es el final linea nula
				{
					System.out.println("el string leido es "+linea);
					String[]LActual= linea.split(",");
					int A=Integer.parseInt(LActual[0]);
					int B=Integer.parseInt(LActual[1]);
					System.out.println("el resultado de la linea "+(i+1)+"es igual a"+(A+B));
				}
				br.close();
			} catch (IOException e) {//posibles errores
				e.printStackTrace();
			
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"error");
		}

	}

}
