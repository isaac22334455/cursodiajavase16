package com.cursodia.java16.mod.semane4;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EjemploJTable extends JFrame implements ActionListener{
	JTable tabla;
	JButton boton;

	public static void main(String[] args)
	{
		
		EjemploJTable et= new EjemploJTable();
		et.crearGUI();
		et.setSize(400,400);
		et.setVisible(true);

	}
	public void crearGUI()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		frame.setLayout(new FlowLayout());
		this.setTitle("EjemplonJTable");
		boton = new JButton("preciona");
		String[] Encabezados= {"clave","titulo","precio","desarrolladora"};
		DefaultTableModel modelo = new DefaultTableModel(null,Encabezados);
		tabla= new JTable(modelo);
		tabla.setPreferredScrollableViewportSize(new Dimension(500,300));
		DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
		centrado.setHorizontalAlignment(JLabel.CENTER);
		for(int i=0;i<Encabezados.length;i++)
		{
			tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
		}
		
		JScrollPane scrollpane = new JScrollPane(tabla);
		
		frame.add(scrollpane);
		frame.add(boton);
		
		boton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int cve=Integer.parseInt(JOptionPane.showInputDialog("clave"));
	    String nom=JOptionPane.showInputDialog("nombre");
		float pre=Float.parseFloat(JOptionPane.showInputDialog("precio"));
		String des=JOptionPane.showInputDialog("desarrolladora");
		DefaultTableModel modelo =  (DefaultTableModel) tabla.getModel();
		Object[] linea= {cve,nom,pre,des};
		modelo.addRow(linea);
	}

}
