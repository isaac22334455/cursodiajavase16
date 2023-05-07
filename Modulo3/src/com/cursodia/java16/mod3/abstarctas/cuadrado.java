package com.cursodia.java16.mod3.abstarctas;

public class cuadrado extends Figura
{
	double lado;

	public cuadrado(String color,double lado)
	{
		super(color);
		this.lado=lado;
		
	}

	@Override
	public double calcularArea() {
		
		return lado*lado;
	}

}
