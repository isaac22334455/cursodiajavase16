package com.cursodia.java16.mod3.abstarctas;

import javax.swing.JOptionPane;

public class PruebaTriangulo {

	public static void main(String[] args) 
	{
       String colorDeltrianguulo =JOptionPane.showInputDialog("Introduzca el color del TRIANGULO:");
		
		double baseDeltriangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base:"));
		double alturaDeltriangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura:"));	
		triangulo triangulo = new triangulo(colorDeltrianguulo, baseDeltriangulo,alturaDeltriangulo);
		System.out.printf("El área del cuadrado %s es: %f", triangulo.getcolor(), triangulo.calcularArea());
	}

}
