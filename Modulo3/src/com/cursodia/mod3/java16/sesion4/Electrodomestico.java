package com.cursodia.mod3.java16.sesion4;

public class Electrodomestico //javabin
{
	private boolean lineablanca;
	private String articulo;
	private boolean usado;
	private String marca;
	//constructor
	public Electrodomestico(boolean lineablanca, String articulo, boolean usado, String marca) 
	{
		this.lineablanca = lineablanca;
		this.articulo = articulo;
		this.usado = usado;
		this.marca = marca;
	}
	//getters y setters
	public String getLineablanca() 
	{
		if(lineablanca)
		{
			return "lineablanca";
		}
		else
		{
		   return "linea gris";
		}
		
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) 
	{
		this.articulo = articulo;
	}
	public String getUsado() 
	{
		if(usado)
		{
			return "usado";	
		}
		else
		{
			return "nuevo";
		}
		
		
	}
	
	public String getMarca() 
	{
		return marca;
	}
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}
	
	
}

	
