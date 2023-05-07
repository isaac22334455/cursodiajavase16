package com.cursodia.java16.mod3.mbc;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.cursodia.java16.mod3.mbc.Videojuego;

public class Modelotv
{
	 int siguiente=0,anterior=0;
	 ArrayList<Videojuego> Almacen = new ArrayList<Videojuego>();
	 
	void guardar(int cve, String nom, int prov,String cate,float precio, int numero)
	 {
		 boolean des=false;
		 for(Videojuego v:Almacen)
			{
				if(v.cve_vid==cve)
				{	
					des=true;
				}	
			}
		    if(des==false)
		    {
		      Almacen.add(new Videojuego(cve,nom,prov,cate,precio,numero)); 
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "LA CLAVE SE REPITE INGRESE OTRA");
		    }
		 
	 }
	
	 void eliminar(int clave, int pos,DefaultTableModel modelo)
	 {
		 int elim=-1 ;	 
			 for(Videojuego v:Almacen)
				{
					if(v.cve_vid==clave)
					{
						elim=Almacen.indexOf(v);	
					}	
				} 
			 Almacen.remove(elim);
			 modelo.removeRow(pos); 
	 }
	 
	 void editar(int clave, String nom, int prov,String cate,float precio, int numero,DefaultTableModel modelo)
	 {
		    int edit =-1;
			for(Videojuego v:Almacen)
			{
				if(v.cve_vid==clave)
				{
				  edit=Almacen.indexOf(v);	
				} 
			}
			
			if(edit==-1)
			{
				JOptionPane.showMessageDialog(null, "JUEGO NO ENCONTRADO");
			}
			else 
			{
			   Almacen.set(edit,new Videojuego(clave,nom,prov,cate,precio,numero));
			   modelo.setValueAt(clave, edit, 0); 
			   modelo.setValueAt(nom, edit, 1);
			   modelo.setValueAt(prov, edit, 2);
			   modelo.setValueAt(cate, edit, 3);
			   modelo.setValueAt(precio, edit, 4);
			   modelo.setValueAt(numero, edit, 5);
			} 
	 }
	
}
