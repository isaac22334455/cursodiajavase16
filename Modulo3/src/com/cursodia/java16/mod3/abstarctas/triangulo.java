package com.cursodia.java16.mod3.abstarctas;

public class triangulo extends Figura
{
	double base,altura;

	public triangulo(String color, double base, double altura) 
	{
		super(color);
		this.base=base;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularArea() 
	{
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

}
