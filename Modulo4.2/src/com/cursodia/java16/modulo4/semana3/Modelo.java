package com.cursodia.java16.modulo4.semana3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import beans.Videojuego;

public class Modelo 
{
	Connection con;
	
	private void conectar()//conectar a la base de datos
	{
		String servidor= "jdbc:mysql://localhost/games";//string de coneccion games=nombre de la base de datos
		String usuario="supervisor";//usuario que se conectara
		String pass="UkmAG54L";//contraseña
		
		try {
			con=DriverManager.getConnection(servidor,usuario,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con!=null)
		{
			System.out.println("conectado");
			
		}
		
	}
	
   public DefaultTableModel mostrarvid(DefaultTableModel modelo)
   {
	  conectar();
	  PreparedStatement pstm=null;
		ResultSet rs=null; //el resulset es parecido a un arreglo, es un array de direcciones de memoria donde poder buscar la informacion en la base de datos
		String query ="SELECT * FROM videojuegos";
		try 
		{
			ArrayList<Videojuego> Lista= new ArrayList<Videojuego>();
			pstm=con.prepareStatement(query);
			rs=pstm.executeQuery();//ya tengo la informacion en el resulset
			System.out.println("cve\t\ttitulo\t\tgenero\t\tproveedor\t\tprecio\t\texistencias");
			
			
				
				String[] encabezados={"CLAVE","TITULO","GENERO","CVE PROV","PRECIO","EXISTENCIAS"};
	
			while(rs.next())
			{
				Lista.add(new Videojuego(rs.getInt("cve_vid"),rs.getString("tit_vid"),rs.getString("gen_vid"),rs.getInt("cveprov_vid"),
						rs.getFloat("pre_vid"),rs.getInt("inv_vid")));
				
				System.out.print(rs.getInt("cve_vid")+"\t\t");
				System.out.print(rs.getString("tit_vid")+"\t\t");
				System.out.print(rs.getString("gen_vid")+"\t\t");
				System.out.print(rs.getInt("cveprov_vid")+"\t\t");
				System.out.print(rs.getFloat("pre_vid")+"\t\t");
				System.out.println(rs.getInt("inv_vid")+"\t\t");
			}
			Object[][] datos= new Object[Lista.size()][6]; 
				for(int i=0;i<Lista.size();i++)
				{
					datos[i][0]=Lista.get(i).getCve_vid();
					datos[i][1]=Lista.get(i).getTit_vid();
					datos[i][2]=Lista.get(i).getGen_vid();
					datos[i][3]=Lista.get(i).getCveprov_vid();
					datos[i][4]=Lista.get(i).getPre_vid();
					datos[i][5]=Lista.get(i).getInv_vid();
					
				}
				modelo= new DefaultTableModel(datos,encabezados);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try 
			{
				if(pstm!=null) pstm.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			cerrar();
			return modelo;
   }
   
   private void cerrar()//cerrar conexion
	{
		
			try 
			{
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
