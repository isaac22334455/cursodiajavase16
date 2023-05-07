package com.cursodia.java16.mod4.semana3;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Vistageneral extends JFrame
{
	public static void main(String[] args) {
		Vistageneral vg = new Vistageneral();
		vg.lanzarVista();
	}
	private JPanel contentPane;
	JButton btnmostrar;
	JTable tabla;
	boolean vistalanzada=false;
	public void lanzarVista()
	{
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearGUI();
					setVisible(true);
					vistalanzada=true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public void crearGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnmostrar = new JButton("MOSTRAR VIDEOJUEGO");
		btnmostrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnmostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmostrar.setBounds(292, 379, 223, 51);
		contentPane.add(btnmostrar);
		Object[][] datos= 
			{
					{"","","","","",""}		
			};
			
			String[] encabezados={"CLAVE","TITULO","GENERO","CVE PROV","PRECIO","EXISTENCIAS"};
			DefaultTableModel modelo= new DefaultTableModel(datos,encabezados);
			tabla=new JTable(modelo);
			JScrollPane ScrollPane= new JScrollPane(tabla);
			ScrollPane.setBounds(21, 11, 811, 359);
			contentPane.add(ScrollPane);
	   
		//panel.setBounds(21, 11, 811, 359);
		
	}
}
