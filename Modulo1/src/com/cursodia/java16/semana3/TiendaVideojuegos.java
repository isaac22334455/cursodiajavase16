package com.cursodia.java16.semana3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TiendaVideojuegos 
{
    ArrayList<Videojuego> Almacen = new ArrayList<Videojuego>();
	public static void main(String[] args)
	{
		TiendaVideojuegos tv = new  TiendaVideojuegos();
		tv.menu();
		
	}
	private void menu()
	{
		int opcion;
		do {
			opcion= Integer.parseInt(JOptionPane.showInputDialog("1-AGREGAR VIDEOJUEGO 2-EDITAR VIDEOJUEGO 3-CONSULTAR VIDEOJUEGO"
                     + " 4-MODIFICAR VIDEOJUEGO 5-DAR DE BAJA VIDEOJUEGO 6-LISTAR TODOS LOS VIDEOJUEGOS 7-SALIR"));
			switch(opcion)
			{
			case 1: altaVideojuegos();
			break;
			case 2: mostrar();
			break;
			case 3: mostrar();
			break;
			case 4: eliminar();
			break;
			case 5: eliminar();
			break;
			case 6: listarVideojuegos();
			break;
			}
		}while(opcion!=7);	
	}
	
	public void altaVideojuegos()
	{
		    		  int otro;
		    		  do
		    			{
		    			    int id = Integer.parseInt(JOptionPane.showInputDialog("id de el videojuego:"));
		    				int cve = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego:"));
		    				String nom = JOptionPane.showInputDialog("nombre del videojuego:");
		    				int prov = Integer.parseInt(JOptionPane.showInputDialog("Provedor:"));
		    				String cate = JOptionPane.showInputDialog("Categoria:");
		    				float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del videojuego:"));
		    				int numero = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a dar de alta:"));
		    				Almacen.add(new Videojuego(id,cve,nom,prov,cate,precio,numero));
		    				 otro= Integer.parseInt(JOptionPane.showInputDialog("DESEA CAPTURAR OTRO 1.SI 2.NO"));
		    			}while(otro ==1);
		
	}
	
	private void editar()
	{
		int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del juego a modificar:"));
		
		for(Videojuego v:Almacen)
		{
			if(v.id_vid==id)
			{
				System.out.println(v);
				int cve = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego:"));
				String nom = JOptionPane.showInputDialog("nombre del videojuego:");
				int prov = Integer.parseInt(JOptionPane.showInputDialog("Provedor:"));
				String cate = JOptionPane.showInputDialog("Categoria:");
				float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del videojuego:"));
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a dar de alta:"));
				Almacen.set(Almacen.indexOf(v),new Videojuego(id,cve,nom,prov,cate,precio,numero));
			}
		}
		System.out.print("JUEGO NO ENCONTRADO");
		
	}
	
	private void mostrar()
	{
		int clave = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego a mostrar:"));
		System.out.println("id\t\tCve\t\tNombre\t\tproveedor\t\tcategoria\t\tprecio\t\texistencia");
		for(Videojuego v:Almacen)
		{
			if(v.cve_vid==clave)
			{
				System.out.println(v);
			}
		}
		System.out.print("JUEGO NO ENCONTRADO");
	}
	
	private void modificar()
	{
       int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del juego a modificar:"));
		
		for(Videojuego v:Almacen)
		{
			if(v.id_vid==id)
			{
				int cve = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego:"));
				String nom = JOptionPane.showInputDialog("nombre del videojuego:");
				int prov = Integer.parseInt(JOptionPane.showInputDialog("Provedor:"));
				String cate = JOptionPane.showInputDialog("Categoria:");
				float precio = Float.parseFloat(JOptionPane.showInputDialog("Precio del videojuego:"));
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a dar de alta:"));
				Almacen.set(Almacen.indexOf(v),new Videojuego(id,cve,nom,prov,cate,precio,numero));
			
			}
		}
		System.out.print("JUEGO NO ENCONTRADO");
	}
	
	private void eliminar()
	{
		int elim=-1,i=0;
		int clave = Integer.parseInt(JOptionPane.showInputDialog("Clave del videojuego a eliminar:"));
		for(Videojuego v:Almacen)
		{
			if(v.cve_vid==clave)
			{
				elim=i;	
			}
			i++;	
		}
		if(elim==-1)
		{
			System.out.print("JUEGO NO ENCONTRADO");
		}
		else 
		{
			Almacen.remove(elim);
		}
	}
	
	private void listarVideojuegos()
	{
		System.out.println("id\t\tCve\t\tNombre\t\tproveedor\t\tcategoria\t\tprecio\t\texistencia");
	
		for(Videojuego v:Almacen)
		{
			System.out.println(v);
		}
	}

}
