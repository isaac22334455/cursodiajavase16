package com.cursodia.java16.semana4.ejemplo1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class lanzador 
{	
	public static void main(String[]args)
	{
		ArrayList<Contador> contadores = new ArrayList<Contador>();
		int otro=2;
		int id=1;
		do
		{
		 int limite=Integer.parseInt(JOptionPane.showInputDialog("CUAL SERA EL LIMITE PARA EL NUEVO CONTADOR"));
		 contadores.add(new Contador(id,limite));
		 id++;
		 otro=Integer.parseInt(JOptionPane.showInputDialog("agregar otro 1 si 2 no"));
		}while(otro==1);
		for(Contador c:contadores)
		{
			c.start();	
		}
		System.out.println("se termino el lanzador");
	}
}


