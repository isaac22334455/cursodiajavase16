package com.cursodia.java16.mod3.abstarctas;

import javax.swing.JOptionPane;

public class PruebaCuadrado {

	public static void main(String[] args) 
	{
		String colorDelCuadrado =JOptionPane.showInputDialog("Introduzca el color del cuadrado:");
		
		double ladoDelCuadrado=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el color del cuadrado:"));
		
		cuadrado cuadrado1 = new cuadrado(colorDelCuadrado, ladoDelCuadrado);
		
		System.out.printf("El área del cuadrado %s es: %f", cuadrado1.getcolor(), cuadrado1.calcularArea());
	}

}
