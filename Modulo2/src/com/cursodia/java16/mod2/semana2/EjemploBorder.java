package com.cursodia.java16.mod2.semana2;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;



public class EjemploBorder extends JFrame
{
	JTextField txtn1,txtn2,txtr;
	JButton sumar;

	public static void main(String[] args)
	{
		EjemploBorder s2 = new EjemploBorder();
		s2.crarGUI();
		s2.setSize(200,150);
		s2.setVisible(true);

	}
	private void crarGUI() {
		//PARTE1
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame= this.getContentPane();
		//frame.setLayout(new FlowLayout());
		
		//pate 2
		JLabel lb1= new JLabel("numero1: ");
		JLabel lb2= new JLabel("numero2: ");
		JLabel lbr= new JLabel("RESULTADO: ");
		
		txtn1= new JTextField(10);
		txtn2= new JTextField(10);
		txtr= new JTextField(10);
		
		sumar= new JButton("sumar");
		
		//parte 2.5
		lb1.setHorizontalAlignment(JLabel.CENTER);
		
		//parte3
		frame.add(lb1,BorderLayout.PAGE_START);
		frame.add(txtn1,BorderLayout.LINE_START);
		frame.add(lb2,BorderLayout.CENTER);
		frame.add(txtn2, BorderLayout.LINE_END);
		frame.add(lbr,BorderLayout.PAGE_END);
		//frame.add(txtr);
		//frame.add(sumar);
		
		
		
	}

}
