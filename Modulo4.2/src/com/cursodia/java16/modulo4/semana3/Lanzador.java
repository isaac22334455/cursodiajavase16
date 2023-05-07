package com.cursodia.java16.modulo4.semana3;

public class Lanzador 
{

	public static void main(String[] args)
	{
		Vistageneral vg=new Vistageneral();
		Modelo md= new Modelo();
		Controlador con=new Controlador(vg,md);

	}

}
