package com.cursodia.java16.semana4.ejemplo2;

public class HiloRunneable implements Runnable
{
	int id;
	int limite;
	
	public static void main(String[] args)
	{
		HiloRunneable[] conts = new HiloRunneable[3];
		for(int i=1;i<3;i++)
		{
			conts[i] = new HiloRunneable(i+1,20);//instancia temporal.
		}
		for(int i=0;i<3;i++)
		{
			new Thread(conts[i]).start();
		}
	}

	public HiloRunneable(int id, int limite)
	{
		this.id=id;
		this.limite=limite;
	}
	public void run() {
		int i=1;
		do
		{
			System.out.println("Soy el hilo"+id+"y voy en: "+i);
			i++;
		}while(i<=limite);
		
	}

}
