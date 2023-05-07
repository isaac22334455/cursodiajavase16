package com.cursodia.java16.mod3.abstarctas;

public abstract class Figura //clase abstracta.
{
	private String color;
	
	
	public Figura(String color)//constructor resive el color y lo vacia  en el atributo de clase.
	{
		this.color=color;
	}
	
	public abstract double calcularArea();//prototipo a utilizar en si la estructura.
	

	public String getcolor()//obtiene y retorna el color.
	{
		return color;
		
	}
}
