package com.cursodia.java16.mod3.mbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Caret;

import com.cursodia.java16.mod3.mbc.Videojuego;

public class Controladortv implements ActionListener
{
	Vistatv v;
	Modelotv m;
	
	public Controladortv(Vistatv v,Modelotv m)
	{
		this.v=v;
		this.m=m;
		v.lanzarGUI();
		ejecutar();
	}
	private void ejecutar()
	{
		while(!this.v.arranque)
		{
				try 
			{
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		v.btnnuevo.addActionListener(this);
		v.btnguardar.addActionListener(this);
		v.btnacepedicion.addActionListener(this);
		v.btnconfborrado.addActionListener(this);
		v.btnacepedicion.addActionListener(this);
		v.btncancelar.addActionListener(this);
		v.btnconfedit.addActionListener(this);
		v.btneditar.addActionListener(this);
		v.btnsalir.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==v.btnnuevo)
		{
			 v.btnguardar.setEnabled(true);
			 v.txtcve.setEnabled(true);
			 v.txtnom.setEnabled(true);
			 v.txtprov.setEnabled(true);
			 v.txtcate.setEnabled(true);
			 v.txtprecio.setEnabled(true);
			 v.txtnumero.setEnabled(true);
			 v.btneditar.setEnabled(false);
			 v.btnsalir.setEnabled(false);
			 v.btncancelar.setEnabled(true);
			 v.btnnuevo.setEnabled(false);
		}
		else if(e.getSource()==v.btnguardar)
		{
		
			int cve=Integer.parseInt(v.txtcve.getText());
			String nom=v.txtnom.getText();
			int prov=Integer.parseInt(v.txtprov.getText());
			String cate=v.txtcate.getText();
			float precio=Float.parseFloat(v.txtprecio.getText());
			int numero=Integer.parseInt(v.txtnumero.getText());
			m.guardar(cve, nom, prov, cate, precio, numero);
			DefaultTableModel modelo =  (DefaultTableModel) v.tabla.getModel();
			Object[] linea= {cve,nom,prov,cate,precio,numero};
			modelo.addRow(linea);
			 v.btnguardar.setEnabled(false);
			 v.btnnuevo.setEnabled(true);
			 v.btneditar.setEnabled(true);
			 v.btnsalir.setEnabled(true);
			 v.btncancelar.setEnabled(false);
			 v.txtcve.setText(null);
			 v.txtnom.setText(null);
			 v.txtprov.setText(null);
			 v.txtcate.setText(null);
			 v.txtprecio.setText(null);
			 v.txtnumero.setText(null);
			 
			
			 
		}
		else if(e.getSource()==v.btncancelar)
		{
		     v.btneditar.setEnabled(false);
			 v.btnguardar.setEnabled(false);
			 v.btnsalir.setEnabled(true);
			 v.btnnuevo.setEnabled(true);
			 v.btnconfedit.setEnabled(false);
			 v.btnacepedicion.setEnabled(false);
			 v.btncancelar.setEnabled(false);
			 v.txtcve.setText(null);
			 v.txtnom.setText(null);
			 v.txtprov.setText(null);
			 v.txtcate.setText(null);
			 v.txtprecio.setText(null);
			 v.txtnumero.setText(null);
			 v.txteditar.setText(null); 
			 v.txtcve.setEnabled(false);
			 v.txtnom.setEnabled(false);
			 v.txtprov.setEnabled(false);
			 v.txtcate.setEnabled(false);
			 v.txtprecio.setEnabled(false);
			 v.txtnumero.setEnabled(false);
			 v.txteditar.setEnabled(false);	
			
		}
		else if(e.getSource()==v.btnconfborrado)
		{
			DefaultTableModel modelo = (DefaultTableModel)v.tabla.getModel();
			int ve=v.tabla.getSelectedRow();
			if(ve==-1)
			{
				JOptionPane.showMessageDialog(null, "SELECCIONE UN ELEMENTO");
			}
			else
			{
				String valor=String.valueOf(modelo.getValueAt(ve,0));
				ve=Integer.parseInt(valor);
				int dato = v.tabla.getSelectedRow();
				 m.eliminar(ve,dato,modelo);
				 v.btnnuevo.setEnabled(true);
				 v.btneditar.setEnabled(true);
			}
			
			
			
		}
		else if(e.getSource()==v.btnacepedicion)
		{	
			int clave=Integer.parseInt(v.txteditar.getText());
			String nom=v.txtnom.getText();
			int prov=Integer.parseInt(v.txtprov.getText());
			String cate=v.txtcate.getText();
			float precio=Float.parseFloat(v.txtprecio.getText());
			int numero=Integer.parseInt(v.txtnumero.getText());
			
			 DefaultTableModel modelo = (DefaultTableModel)v.tabla.getModel(); 
			 m.editar(clave,nom, prov, cate, precio, numero,modelo);
			 v.btnnuevo.setEnabled(true);
			 v.btnconfedit.setEnabled(false);
			 v.btnacepedicion.setEnabled(false);
		}
		else if(e.getSource()==v.btnconfedit)
		{
			int clave=Integer.parseInt(v.txteditar.getText());
			    
      			 v.btnconfedit.setEnabled(false);
				 v.txteditar.setEnabled(false);
				 v.txtnom.setEnabled(true);
				 v.txtprov.setEnabled(true);
				 v.txtcate.setEnabled(true);
				 v.txtprecio.setEnabled(true);
				 v.txtnumero.setEnabled(true);
				 v.btnacepedicion.setEnabled(true); 
		}
		else if(e.getSource()==v.btneditar)
		{
			 v.btncancelar.setEnabled(true);
			 v.txteditar.setEnabled(true);
			 v.btnconfedit.setEnabled(true);
			 v.btnnuevo.setEnabled(false);
			 
		}
		else if(e.getSource()==v.btnsalir)
		{
				System.exit(0); 
		}
	
	}
	

}
