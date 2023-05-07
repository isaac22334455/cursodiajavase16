package com.cursodia.java16.semana4.ejemplo3;

public class Contador implements Runnable
{
	int id;
	int limite;
	
	public Contador(int id, int limite) {
		this.id = id;
		this.limite = limite;
	}

	public void run()
	{
		int i=1;
		do
		{
			System.out.println("Soy el hilo"+id+"y voy en: "+i);
			i++;
		}while(i<=limite);
	}

}
