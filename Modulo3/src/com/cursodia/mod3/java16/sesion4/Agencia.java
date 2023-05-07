package com.cursodia.mod3.java16.sesion4;//clase que trabaja con reflection...

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Agencia <T>//T para trabajar con instancias genericas
{
	private T t;//tiene que tener su atributo
	
	ArrayList<T> lista=new ArrayList<T>();
	public static void main(String[] args) 
	{
		Agencia ag=new Agencia();
		ag.crearinstancias();
		//Automovil a =new Automovil("chevrolet ",2022,false,"rojo","deportivo");//si se imprime directo esto nos mande el hascode del tipo de la clase
		//a.hascode ya saca el hascode de la instancia
		//uso de genericos...
		//ag.t=a;
		//ag.usandoRelfection();
		//Electrodomestico el = new Electrodomestico(true,"refrif",false,"samsung");
		//ag.t=el;
		//ag.usandoRelfection();
		
	}
	private void crearinstancias()
	{
		lista.add((T) new Automovil("chevrolet ",2022,false,"rojo","deportivo"));
		lista.add((T) new Electrodomestico(true,"refrif",false,"samsung"));
		for(T objeto: lista)
		{
			usandoRelfection(objeto);
		}
	}
	private void usandoRelfection(T	instancia)
	{	
		Method[] metodos = instancia.getClass().getMethods();//obtiene los nombres de todos los metodos de toda la clase y los almacena en el array
		String substing = "get";//get los que todos los metodos que me interesan tienen en comun.
		
		for(Method m:metodos)
		{
			if(m.getName().contains(substing))//compara nombre de los metodos
			{
				if(!m.getName().equals("getClass"))//para excluir de la imprecion el getclass
				{
					try {
						System.out.println(m.invoke(instancia,null));
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}
		}
	}

}
