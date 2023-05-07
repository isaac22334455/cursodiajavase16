package com.cursodia.java16.mod3.mbc;

public class Lanzador {

	public static void main(String[] args) 
	{
		Modelotv mtv= new Modelotv();
		Vistatv vtv= new Vistatv();
		Controladortv controlador= new Controladortv(vtv,mtv);

	}

}
