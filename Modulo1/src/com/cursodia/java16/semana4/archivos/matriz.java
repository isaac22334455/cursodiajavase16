package com.cursodia.java16.semana4.archivos;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class matriz {

	public static void main(String[] args) 
	{
		String p ="Files/Matriz.txt";
		Path ruta = Paths.get(p);
		if(Files.exists(ruta))
		{
			try {//intento
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(p),"utf-8"));
				String linea = null;
				int i =0,bertices=0,aristas=0;
				while((linea= br.readLine())!=null)//null es el final linea nula
				{
					System.out.println("el string leido es "+linea);
					String[]LActual= linea.split(",");
					int A1=Integer.parseInt(LActual[0]);
					int A2=Integer.parseInt(LActual[1]);
					int A3=Integer.parseInt(LActual[2]);
					int A4=Integer.parseInt(LActual[3]);
					int A5=Integer.parseInt(LActual[4]);
					int A6=Integer.parseInt(LActual[5]);
					int A7=Integer.parseInt(LActual[6]);
					int A8=Integer.parseInt(LActual[7]);
					int A9=Integer.parseInt(LActual[8]);
					int A10=Integer.parseInt(LActual[9]);
					int A11=Integer.parseInt(LActual[10]);
					if(A1==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A2==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A3==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A4==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A5==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A6==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A7==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A8==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A9==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A10==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}
					if(A11==0)
					{
						bertices++;
					}
					else
					{
						aristas++;
					}	
				}
				System.out.println("bertices"+bertices);
				System.out.println("aristas"+aristas);
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
