package com.cursodia.java16.mod2.semana2;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Ejemplogrid extends JFrame
{
	JTextField txtn1,txtn2,txtr;
	JButton sumar;

	public static void main(String[] args)
	{
		Ejemplogrid  s2 = new Ejemplogrid ();
		s2.crarGUI();
		s2.setSize(300,300);
		s2.setVisible(true);

	}
	
	private void crarGUI() 
	{
		//PARTE1
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame= this.getContentPane();
		frame.setLayout(new GridLayout(5,2));//especificar numero de columnas y renglones
		
		//pate 2
		JLabel lb1= new JLabel("numero1: ");
		JLabel lb2= new JLabel("numero2: ");
		JLabel lbr= new JLabel("RESULTADO: ");
		JLabel vacio= new JLabel("");
		
		txtn1= new JTextField(10);
		txtn2= new JTextField(10);
		txtr= new JTextField(10);
		
		sumar= new JButton("sumar");
		
		//parte 2.5 modificar propiedades de los elementos...
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lbr.setHorizontalAlignment(JLabel.CENTER);
	
		
		
		//parte3
		frame.add(lb1);
		frame.add(txtn1);
		frame.add(lb2);
		frame.add(txtn2);
		frame.add(lbr);
		frame.add(txtr);
		frame.add(vacio);
		
		frame.add(sumar);
	}
}



