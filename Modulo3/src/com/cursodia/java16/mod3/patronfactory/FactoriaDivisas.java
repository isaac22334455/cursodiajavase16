package com.cursodia.java16.mod3.patronfactory;

public class FactoriaDivisas 
{
	public static Divisas factoria(String tipo)
	{
		if(tipo.equals("AN"))
		{
			return new Americanorte();
		}
		else
		{
			return new Asia();
		}
		
	}

}
