package com.cursodia.java16.modulo3.sesion3;

public class Videojuegos //clase prinsipal que hace uso de la interface y clase abstarcta
{

	public static void main(String[] args) 
	{
		Videojuegos vi=new Videojuegos();
		vi.ejecutarconsulta();
	}
	private void ejecutarconsulta()
	{
		Filtropropiedades prop= new Videojuego();
		prop.encabezado();//se  instancia el nuevo metodo.
		prop.consola();
		prop.consultarprecio();
		prop.desarrolladora();	
	}

}
