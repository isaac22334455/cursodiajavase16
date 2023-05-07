package com.cursodia.java16.mod2.semana2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import examenmedio.Sumamultiresta2numeros;


public class Problema2 extends JFrame implements ActionListener
{
	JTextField txtcve,txtnomprod,txtcant,txtcvevend;
	JButton btnnuevoproducto, btnventa,btnagregar,btnvender;

	public static void main(String[] args) 
	{
		Problema2 pm2 = new Problema2();
		pm2.crearGUI();
		pm2.setSize(750,450);//300*300: ancho y alto en px.
		pm2.setResizable(false);//no se podra modificar el tamaño de la ventana
		pm2.setVisible(true);//para que se vea
	}
	
	public void crearGUI()
	{
		//Modificar el contenedor maximo(ventana)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
		//frame
		Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
		frame.setLayout(null);//null para usar el absolut.
		this.setTitle("punto de venta basico");
		
		//Instanciar objetos
		JLabel lbcve= new JLabel("clave de producto");
		JLabel lbnomprod= new JLabel("nombre del producto");
		JLabel lbcant= new JLabel("cantidad a dar de alta");
		JLabel lbcvevend= new JLabel("clave del producto a vender");
		
		txtcve= new JTextField(12);//12:limite maximo de caracteres VISIBLES
		txtnomprod= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtcant= new JTextField(12);//limite maximo de caracteres VISIBLE
		txtcvevend= new JTextField(12);//limite maximo de caracteres VISIBLE
		
		btnnuevoproducto = new JButton("nuevo producto");
		btnventa = new JButton("venta");
		btnagregar = new JButton("agregar");
		btnvender = new JButton("vender");
		
		
		//posicionar elementos en pantalla
		lbcve.setBounds(25,25,150,30);
		txtcve.setBounds(160,25,70,30);
		
		lbnomprod.setBounds(25,65,150,30);
		txtnomprod.setBounds(160,65,70,30);
		
		lbcant.setBounds(25,95,150,30);
		txtcant.setBounds(160,95,70,30);
		
		lbcvevend.setBounds(320,65,200,30);
		txtcvevend.setBounds(490,65,70,30);
		
		btnagregar.setBounds(25,160,120,30);
		btnnuevoproducto.setBounds(25,200,150,30);
		btnventa.setBounds(450,110,120,30);
		btnvender.setBounds(450,150,120,30);
		
		
		
		//agregar los elementos al contenedor (a el frame).
		//frame.add(lbtitulo);
		frame.add(lbcve);
		frame.add(txtcve);
		frame.add(lbnomprod);
		frame.add(txtnomprod);
		frame.add(lbcant);
		frame.add(txtcant);
		frame.add(lbcvevend);
		frame.add(txtcvevend);	
		frame.add(btnagregar);
		frame.add(btnvender);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnagregar) 
		{
		  
			
		}
		
	}

}
