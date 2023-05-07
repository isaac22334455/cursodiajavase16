package com.cursodia.java16.mod3.mbc;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.text.Collator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import com.cursodia.java16.mod3.mbc.Videojuego;

public class Vistatv extends JFrame {
	JTable tabla;
    boolean arranque= false;
	JTextField txtcve,txtnom,txtprov,txtcate,txtprecio,txtnumero,txteditar;
	JButton btnnuevo,btnguardar,btneditar,btncancelar,btnsalir,btnacepedicion,btnconfedit,btnconfborrado;
	public static void main(String[] args) 
	{
		Vistatv tv=new Vistatv();
		tv.lanzarGUI();
		

	}
	void lanzarGUI()
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					crearGUI();
					setVisible(true);
					setSize(1000,550);
					arranque = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void crearGUI()
	{
		
		 //Modificar el contenedor maximo(ventana)
	     this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
		 //frame
		 Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
		 frame.setLayout(null);//null para usar el absolut.
		 this.setTitle("TIENDA DE VIDEOJUEGOS");
		 //instansear objetos.
		 JLabel lbcve= new JLabel("CLAVE DE EL VIDEOJUEGO");
		 JLabel lbnom= new JLabel("NOMBRE DE EL VIDEOJUEGO");
		 JLabel lbprov= new JLabel("PROVEDOR");
		 JLabel lbcate= new JLabel("CATEGORIA");
		 JLabel lbprecio= new JLabel("PRECIO DE EL VIDEOJUEGO");
		 JLabel lbnumero= new JLabel("CANTIDAD A DAR DE ALTA");
		 JLabel lbeditar= new JLabel("INGRESE LA CLAVE DEL VIDEOJUEGO A EDITAR");
		
	     //tabla
		    String[] Encabezados= {"clave","titulo","provedor","categoria","precio","cantidad"};
			DefaultTableModel modelo = new DefaultTableModel(null,Encabezados);
			tabla= new JTable(modelo);
			tabla.setPreferredScrollableViewportSize(new Dimension(500,300));
			DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
			JScrollPane scrollpane = new JScrollPane(tabla);
			frame.add(scrollpane);
			scrollpane.setBounds(450,10,600,380);
		 
		 txtcve= new JTextField(12);
		 txtnom= new JTextField(12);
		 txtprov= new JTextField(12);
		 txtcate= new JTextField(12);
		 txtprecio= new JTextField(12);
		 txtnumero= new JTextField(12);
		 txteditar= new JTextField(12);
		 
		 btnnuevo = new JButton("NUEVO");
		 btnguardar = new JButton("GUARDAR");
		 btneditar = new JButton("HABILITAR ZONA DE EDICION");
		 btnacepedicion = new JButton("CORRIGA LOS CAMPOS A EDITAR Y DE CLICK AQUI");
		 btncancelar = new JButton("CANCELAR");
		 btnconfedit = new JButton("ACEPTAR");
	     btnconfborrado = new JButton("SELECCIONE UN JUEGO Y DE CLICK AQUI PARA ELIMINAR");
		 btnsalir = new JButton("SALIR");
		 
		 
		//posicionar elementos en pantalla
		 lbcve.setBounds(25,55,180,20);
		 txtcve.setBounds(205,55,100,20);
		 lbnom.setBounds(25,85,180,20);
		 txtnom.setBounds(205,85,100,20);
		 lbprov.setBounds(25,115,180,20);
		 txtprov.setBounds(205,115,100,20);
		 lbcate.setBounds(25,145,180,20);
		 txtcate.setBounds(205,145,100,20);
		 lbprecio.setBounds(25,175,180,20);
		 txtprecio.setBounds(205,175,100,20);
		 lbnumero.setBounds(25,205,180,20);
		 txtnumero.setBounds(205,205,100,20);
		 lbeditar.setBounds(25,320,300,40);
		 txteditar.setBounds(80,370,70,40);
		 
		 btnnuevo.setBounds(320,55,110,30);
		 btnguardar.setBounds(320,100,110,30);
		 btneditar.setBounds(25,260,290,40);
		 btnacepedicion.setBounds(25,10,350,20);
		 btnconfedit.setBounds(160,370,100,40);
		 btnconfborrado.setBounds(650,400,400,40);
		 btncancelar.setBounds(470,410,110,30);
		 btnsalir.setBounds(470,450,110,30);
		 
		 
		//agregar los elementos al contenedor (a el frame).
		 frame.add(lbcve);
		 frame.add(txtcve);
		 frame.add(lbnom);
		 frame.add(txtnom);
		 frame.add(lbprov);
		 frame.add(txtprov);
		 frame.add(lbcate);
		 frame.add(txtcate);
		 frame.add(lbprecio);
		 frame.add(txtprecio);
		 frame.add(lbnumero);
		 frame.add(txtnumero);
		 frame.add(txteditar);
		 frame.add(lbeditar);
		 frame.add(btnnuevo);
		 frame.add(btnguardar);
		 frame.add(btneditar);
		 frame.add(btnacepedicion);
		 frame.add(btncancelar);
		 frame.add(btnsalir);
		 frame.add(btnconfedit);
		 frame.add(btnconfborrado);
		
		 btnguardar.setEnabled(false);
		 btneditar.setEnabled(false);
		 btnacepedicion.setEnabled(false);
		 btnguardar.setEnabled(false);
		 btncancelar.setEnabled(false);
		 txtcve.setEnabled(false);
		 txtnom.setEnabled(false);
		 txtprov.setEnabled(false);
		 txtcate.setEnabled(false);
		 txtprecio.setEnabled(false);
		 txtnumero.setEnabled(false);
		 txteditar.setEnabled(false);
		 btnconfedit.setEnabled(false);
		 btnconfborrado.setEnabled(true);
			
		 
		 
	}
}
