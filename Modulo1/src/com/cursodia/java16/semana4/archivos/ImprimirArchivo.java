package com.cursodia.java16.semana4.archivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.swing.JOptionPane;

public class ImprimirArchivo {

	public static void main(String[] args) 
	{
		String p= "Files/saludo.txt";
		
		try 
		{
			Writer wt = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(p),"utf-8"));
			String Linea = JOptionPane.showInputDialog("ingresar texto: ");
			wt.write(Linea);
			wt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
