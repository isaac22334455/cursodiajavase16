package com.cursodia.java16.semana2;

import javax.swing.JOptionPane;

public class sistemasNumericos  extends figurasVolumen{
	
	public static void main(String[] args)
	{
		sistemasNumericos sn = new sistemasNumericos();
		sn.setparam();
	}
	
	private void setparam() 
	{
	  System.out.println("EN QUE SISTEMA ESTAN LOS DATOS DE ENTRADA");
	  System.out.println("1.SISTEMA INTERNACIOAL");
	  System.out.println("2.SISTEMA AMERICANO");
	  int datosin =Integer.parseInt(JOptionPane.showInputDialog(""));
	  System.out.println("EN QUE SISTEMA ESTAN LOS DATOS DE SALIDA");
	  System.out.println("1.SISTEMA INTERNACIOAL");
	  System.out.println("2.SISTEMA AMERICANO");
	  int datosout =Integer.parseInt(JOptionPane.showInputDialog(""));
	  
		  int resp=elegirfigura();
		     if(resp!=0)
		     {
				leervalores(resp);
				if(datosin==datosout)
				{
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
				
				 if(datosin==1 && datosout==2)
			      {
					 if(resp==1)
						{
							 imprimirresultado(resp,inttoam(areafigura(base,altura)));
						}
						else if(resp==2)
						{
							imprimirresultado(resp,inttoam(areafigura(base,base)));
						}
						else if(resp==3) 
						{
							imprimirresultado(resp,inttoam(areafigura(3.1416,Math.pow(radio, 2))));
						}
						else if(resp==4)
						{
							imprimirresultado(resp,inttoam(volumenFigura(base,base,base)));
						}
						else if(resp==5)
						{
							imprimirresultado(resp,inttoam(volumenFigura(base,ancho,altura)));
						}
						else if(resp==6)
						{
							imprimirresultado(resp,inttoam(volumencirculo(Math.pow(radio,3))));
						}
			    	 System.out.print("pulgadas");
			      }
				 else if(datosin==2 && datosout==1)
				 {
					 if(resp==1)
						{
							 imprimirresultado(resp,amtoint(areafigura(base,altura)));
						}
						else if(resp==2)
						{
							imprimirresultado(resp,amtoint(areafigura(base,base)));
						}
						else if(resp==3) 
						{
							imprimirresultado(resp,amtoint(areafigura(3.1416,Math.pow(radio, 2))));
						}
						else if(resp==4)
						{
							imprimirresultado(resp,amtoint(volumenFigura(base,base,base)));
						}
						else if(resp==5)
						{
							imprimirresultado(resp,amtoint(volumenFigura(base,ancho,altura)));
						}
						else if(resp==6)
						{
							imprimirresultado(resp,amtoint(volumencirculo(Math.pow(radio,3))));
						}
					 System.out.print("cm"); 
				 }
		     }   
	}
	
	private double inttoam(double valor)
	{
		return valor/2.54d;
	}
	
	private double amtoint(double valor)
	{
		return valor*2.54d;
	}
	

}
