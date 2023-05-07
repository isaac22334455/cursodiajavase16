package com.cursodia.java16.modulo4.semana3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Videojuego;

public class Modelo 
{
	Session session=null;	
	private void conectar()//conectar a la base de datos
	{
		try {
			SessionFactory factoria = new Configuration().configure().buildSessionFactory();
			session=factoria.openSession();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(session!=null)
		{
			System.out.println("conectado");
			
		}
		
	}
	
   public DefaultTableModel mostrarvid(DefaultTableModel modelo)
   {
	  conectar();
		try
		{
			String[] encabezados={"CLAVE","TITULO","GENERO","CVE PROV","PRECIO","EXISTENCIAS"};
			Query consulta= session.createQuery("from Videojuego videojuego");
			List<Videojuego> lista= consulta.list();
			for(Videojuego v:lista)
			{
				System.out.println(v.getCve_vid()+"\t\t"+v.getTit_vid()+"\t\t"+v.getGen_vid()+"\t\t"+v.getInv_vid()+"\t\t"+v.getPre_vid());
				
			}	
			Object[][] datos= new Object[lista.size()][6]; 
			for(int i=0;i<lista.size();i++)
			{
				datos[i][0]=lista.get(i).getCve_vid();
				datos[i][1]=lista.get(i).getTit_vid();
				datos[i][2]=lista.get(i).getGen_vid();
				datos[i][3]=lista.get(i).getCveprov_vid();
				datos[i][4]=lista.get(i).getPre_vid();
				datos[i][5]=lista.get(i).getInv_vid();
				
			}
			modelo= new DefaultTableModel(datos,encabezados);
		}catch(HibernateException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			if(session!=null)session.close();
		}

			return modelo;
   }
	
}
