package com.cursodia.java16.semana2;

import javax.swing.JOptionPane;

public class figurasVolumen extends figuras{

	public static void main(String[]args)
	{
		figurasVolumen fv= new figurasVolumen();
		fv.imprecion();
		
		
	}
	protected void imprecion()
	{
		int resp=elegirfigura();
		if(resp!=0)
		{
			leervalores(resp);
			if(resp==1)
			{
				 imprimirresultado(resp,areafigura(base,altura));
			}
			else if(resp==2)
			{
				imprimirresultado(resp,areafigura(base,base));
			}
			else if(resp==3) 
			{
				imprimirresultado(resp,areafigura(3.1416,Math.pow(radio, 2)));
			}
			else if(resp==4)
			{
				imprimirresultado(resp,volumenFigura(base,base,base));
			}
			else if(resp==5)
			{
				imprimirresultado(resp,volumenFigura(base,ancho,altura));
			}
			else if(resp==6)
			{
				imprimirresultado(resp,volumencirculo(Math.pow(radio,3)));
			}
		}
	}
	protected double volumenFigura (double a,double b, double c)
	{
		return (a*b)*c; 	
	}
	
	protected double volumencirculo (double a)
	{
		return (a*4)*(3.1416)/3;  	
	}
	

}
