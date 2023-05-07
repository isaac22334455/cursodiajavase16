package com.cursodia.mod3.java16.sesion4;

public class Automovil 
{
	private String marca;
	private int modelo;
	private boolean condicion;//true usado flase nuevo
	private String color;
	private String linea;
	public Automovil(String marca, int modelo, boolean condicion, String color, String linea) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.condicion = condicion;
		this.color = color;
		this.linea = linea;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public boolean isCondicion() {
		return condicion;
	}
	public void setCondicion(boolean condicion) {
		this.condicion = condicion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	

}
