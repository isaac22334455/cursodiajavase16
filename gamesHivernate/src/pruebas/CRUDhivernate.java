package pruebas;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Videojuego;

public class CRUDhivernate {

	public static void main(String[] args) 
	{
		CRUDhivernate hib = new CRUDhivernate();
		hib.actualizar();
		//hib.eliminar();
		//hib.altavid();
		hib.leerVids();
		
	}
	
	public void leerVids()
	{
		Session session=null;
		
		try
		{
			SessionFactory factoria = new Configuration().configure().buildSessionFactory();
			session=factoria.openSession();
			Query consulta= session.createQuery("from Videojuego videojuego");
			List<Videojuego> lista= consulta.list();
			for(Videojuego v:lista)
			{
				System.out.println(v.getCve_vid()+"\t\t"+v.getTit_vid()+"\t\t"+v.getGen_vid()+"\t\t"+v.getCveprov_vid()+"\t\t"+v.getInv_vid()+"\t\t"+v.getPre_vid());	
			}	
		}catch(HibernateException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			
			if(session!=null)session.close();
		}
			
	}
	
	public void altavid()
	{
		Session session = null;
		org.hibernate.Transaction transaccion = null;
		
	    try {
	    	SessionFactory factoria = new Configuration().configure().buildSessionFactory();
		    session=factoria.openSession();
		    transaccion= session.beginTransaction();
		    Videojuego v=new Videojuego("zelda","rpg",1,900f,30);
		    session.save(v);
		    transaccion.commit();
	
			
		} 
	    catch (SecurityException  e) 
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
	
	
	public void eliminar()
	{
		Session session = null;
		org.hibernate.Transaction transaccion = null;
		
	    try {
	    	SessionFactory factoria = new Configuration().configure().buildSessionFactory();
		    session=factoria.openSession();
		    transaccion= session.beginTransaction();
		    Videojuego v= session.get(Videojuego.class,8);
		    session.delete(v);
		    transaccion.commit();
		} 
	    catch (SecurityException  e) 
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
	
	public void actualizar()
	{
		Session session = null;
		org.hibernate.Transaction transaccion = null;
		
	    try {
	    	SessionFactory factoria = new Configuration().configure().buildSessionFactory();
		    session=factoria.openSession();
		    transaccion= session.beginTransaction();
		    Videojuego v= session.get(Videojuego.class,2);
		    v.setTit_vid("mission");
		    session.update(v);
		    transaccion.commit();
		} 
	    catch (SecurityException  e) 
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
