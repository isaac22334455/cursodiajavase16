package com.cursodia.java16.semana4.ejemplo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HiloPoolT {
	
	public static void main(String[] args)
	{
		System.out.println("hilos de pool thread");
		Runnable R[]= new Runnable[20];
		for(int i=0;i<R.length;i++)
		{
			R[i]= new Contador(i+1,20);
		}
		ExecutorService exe= Executors.newFixedThreadPool(4);//parametro de hilos que se ejecuten simultanea mente(tamaño de la picina)
		for(Runnable c:R)
		{
			exe.execute(c);
		}
		exe.shutdown();
	}

}
