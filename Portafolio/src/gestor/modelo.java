package gestor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Videojuego;

public class modelo 
{
	boolean validar= false;
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
	
	 public void guardar(String nom, int prov,String gen,float precio, int cant)
	 {
		 conectar();
		 org.hibernate.Transaction transaccion = null;
		 try 
		 {
	     String[] encabezados={"CLAVE","TITULO","GENERO","CVE PROV","PRECIO","EXISTENCIAS"};
		 Videojuego v = new Videojuego(nom,gen,prov,precio,cant);
		 transaccion= session.beginTransaction();
		 session.save(v);
		 transaccion.commit();
		 }catch (SecurityException  e) 
		    {
				e.printStackTrace();
			}
		    catch(HibernateException e)
		    {
		    	System.out.println(e.getMessage());
		    	try {
					transaccion.rollback();//revierte cambios se cancelan cambios
				} catch (IllegalStateException e1) {
					System.out.println("se ejecuto un rollback");
					e1.printStackTrace();
				}
		    }
		
	 }
	 public void eliminar(int cveelim)
	 {
		 conectar();
		 org.hibernate.Transaction transaccion = null;
		 try 
		 {
				 transaccion= session.beginTransaction();
			     Videojuego v= session.get(Videojuego.class,cveelim);
			     if (v == null) 
			     {
			    	 transaccion.rollback();
			    	 JOptionPane.showMessageDialog(null, "JUEGO NO ENCONTRADO");
			     }
			     else
			     {
			    	 session.delete(v);
					 transaccion.commit();  
			     }
		 }catch (SecurityException  e) 
		    {
				e.printStackTrace();
			}
		    catch(HibernateException e)
		    {
		    	System.out.println(e.getMessage());
		    	try {
					transaccion.rollback();//revierte cambios se cancelan cambios
				} catch (IllegalStateException e1) {
					System.out.println("se ejecuto un rollback");
					e1.printStackTrace();
				}
		    }
	 }
	 
	
	public void editarvalid(int cveedit)
	 {
		 conectar();
		 org.hibernate.Transaction transaccion = null;
		 try 
		 {
			 transaccion= session.beginTransaction();
			 Videojuego v= session.get(Videojuego.class,cveedit);
		 
		 if (v == null) 
	     {
	    	 transaccion.rollback();
	    	 JOptionPane.showMessageDialog(null, "JUEGO NO ENCONTRADO");
	     }
		 else
		 {
			validar=true; 
		 }
		 }catch (SecurityException  e) 
		    {
				e.printStackTrace();
			}
		    catch(HibernateException e)
		    {
		    	System.out.println(e.getMessage());
		    	try {
					transaccion.rollback();//revierte cambios se cancelan cambios
				} catch (IllegalStateException e1) {
					System.out.println("se ejecuto un rollback");
					e1.printStackTrace();
				}
		    }
		 
	 }
	 
	 public void editar(int cveedit,String nom, int prov,String gen,float precio, int cant)
	 {
		 conectar();
		 org.hibernate.Transaction transaccion = null;
		 try 
		 {
				 transaccion= session.beginTransaction();
			     Videojuego v= session.get(Videojuego.class,cveedit);
			    	 v.setTit_vid(nom);
			    	 v.setCveprov_vid(prov);
			    	 v.setGen_vid(gen);
			    	 v.setPre_vid(precio);
			    	 v.setInv_vid(cant);
					  session.update(v);
					 transaccion.commit(); 
		 }catch (SecurityException  e) 
		    {
				e.printStackTrace();
			}
		    catch(HibernateException e)
		    {
		    	System.out.println(e.getMessage());
		    	try {
					transaccion.rollback();//revierte cambios se cancelan cambios
				} catch (IllegalStateException e1) {
					System.out.println("se ejecuto un rollback");
					e1.printStackTrace();
				}
		    }
	 }
}
