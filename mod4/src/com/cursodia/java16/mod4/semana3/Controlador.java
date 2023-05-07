package com.cursodia.java16.mod4.semana3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;
public class Controlador implements ActionListener
{
	  Vistageneral vg;
	  Modelo mod;
	  
	public Controlador(Vistageneral vg, Modelo mod) 
	{
		
		this.vg = vg;
		this.mod = mod;
		vg.lanzarVista();
		agregarlisteners();
	}
	private void agregarlisteners()
	{
		while(!vg.vistalanzada)
		{
			System.out.println("cargando");
		}
		vg.btnmostrar.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		DefaultTableModel modelo=(DefaultTableModel) vg.tabla.getModel();
		DefaultTableModel modvid= mod.mostrarvid(modelo);
		vg.tabla.setModel(modvid);
		// TODO Auto-generated method stub
		
	}
  
}
