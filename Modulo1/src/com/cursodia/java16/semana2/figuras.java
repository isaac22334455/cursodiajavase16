//instancia:copia de una clase para utilizarla en otra.
package com.cursodia.java16.semana2;

import java.util.Date;

import javax.swing.JOptionPane;

public class figuras 
{
	double base,altura,ancho,radio;
	public static void main(String[]args)
	{
		figuras fig= new figuras();
		int resp=fig.elegirfigura();
		if(resp!=0)
		{
			fig.leervalores(resp);
			if(resp==1)
			{
				 fig.imprimirresultado(resp,fig.areafigura(fig.base,fig.altura));
			}
			else if(resp==2)
			{
				fig.imprimirresultado(resp,fig.areafigura(fig.base,fig.base));
			}
			else if(resp==3) 
			{
				fig.imprimirresultado(resp,fig.areafigura(3.1416,fig.radio*fig.radio));
			}
		}
	}
	
	protected int elegirfigura() 
	{
		int op=Integer.parseInt(JOptionPane.showInputDialog("que opcion escoje? 1-RECTANGULO(AREA) 2-CUADRADO(AREA) 3-CIRCULO(AREA) 4-CUBO(VOLUMEN) 5-PRISMA RECTANGULAR(VOLUMEN) 6-ESFERA(VOLUMEN)"));
	    
		if(op<1 || op>6)
		{
			System.out.print("figura no valida");
		}
		else
		{
			return op;
		}
		return 0;
	}
	
	protected void leervalores(int tipo) 
	{
			if(tipo==3 || tipo==6)
			{
			  radio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio"));
		    }
		   else if(tipo==5)
		   {
			   base = Double.parseDouble(JOptionPane.showInputDialog("ingrese el largo de la base"));
			   ancho = Double.parseDouble(JOptionPane.showInputDialog("ingrese el ancho de la base"));
			   altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
				
			}
		   else
		   {
			   base = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
				if(tipo==1)
				{
					altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
				}
		   }
	   }
	
	protected double areafigura(double a, double b)
	{
		return b*a;
		
	}
	
	protected void imprimirresultado(int tipo, double res)
	{
		if(tipo==1)
		{
			System.out.println("el area del rectangulo es: "+res);
		}
		else if(tipo==2)
		{
			System.out.println("el area del cuadrado es: "+res);
		}
		else if(tipo==3)
		{
			System.out.println("el area del circulo es: "+res);
		}
		else if(tipo==4)
		{
			System.out.println("el volumen de el cubo es: "+res);
		}
		else if(tipo==5)
		{
			System.out.println("el volumen de el prisma es: "+res);
		}
		else if(tipo==6)
		{
			System.out.println("el volumen de la esfera es: "+res);
		}
	}
	

}
