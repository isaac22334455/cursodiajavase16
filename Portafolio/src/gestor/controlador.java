package gestor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import beans.Videojuego;
public class controlador implements ActionListener
{
	int cveedit;
	VistaPrinsipal v;
	VistaModificar v2;
	modelo m;
	
	public controlador(VistaPrinsipal v, modelo m,VistaModificar v2)
	{
		this.v2=v2;
	    this.v=v;
		this.m=m;
		v.lanzarGUI();
		v2.lanzarGUI();
		agregarlisteners();
	}
	
	
	private void agregarlisteners()
	{
		while(v.thv1.isAlive()==true || v2.thv2.isAlive()==true)
		{
			try 
			{
				Thread.sleep(100);
				
			}catch(InterruptedException e)
			{
				
			}
		}
		DefaultTableModel modelo=(DefaultTableModel) v.tabla.getModel();
		DefaultTableModel modvid= m.mostrarvid(modelo);
		v.tabla.setModel(modvid);
		v.tabla2.setModel(modvid);
		v.btnguardar.addActionListener(this);
		v.btncancelar.addActionListener(this);
		v.btneliminar.addActionListener(this);
		v.btneditar.addActionListener(this);
		v2.btnguardar.addActionListener(this);
		v2.btncancelar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==v.btnguardar)
		{
			if(v.txtnomvid.getText().isEmpty() && v.txtprov.getText().isEmpty() && v.txtpre.getText().isEmpty() && v.txtgen.getText().isEmpty())
			{
				 JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOS");
			}
			else
			{
				String nom=v.txtnomvid.getText();
				int prov=Integer.parseInt(v.txtprov.getText());
				int cant=Integer.parseInt(v.txtcant.getText());
				float precio=Float.parseFloat(v.txtpre.getText());
				String gen=v.txtgen.getText();
				m.guardar( nom, prov, gen, precio, cant);
				DefaultTableModel modelo=(DefaultTableModel) v.tabla.getModel();
				DefaultTableModel modvid= m.mostrarvid(modelo);
				v.tabla.setModel(modvid);
				v.txtnomvid.setText(null);
				v.txtgen.setText(null);
				v.txtcant.setText(null);
				v.txtpre.setText(null);
				v.txtprov.setText(null);
			}
		}
		else if(e.getSource()==v.btncancelar)
		{
			v.txtnomvid.setText(null);
			v.txtgen.setText(null);
			v.txtcant.setText(null);
			v.txtpre.setText(null);
			v.txtprov.setText(null);
		}
		else if(e.getSource()==v.btneliminar)
		{
			if(v.txtedel.getText().isEmpty())
			{
			  JOptionPane.showMessageDialog(null, "TIENE QUE INGRESAR UN VALOR");
			}
			else
			{
				int cveelim=Integer.parseInt(v.txtedel.getText());
				m.eliminar(cveelim);
				DefaultTableModel modelo=(DefaultTableModel) v.tabla.getModel();
				DefaultTableModel modvid= m.mostrarvid(modelo);
				v.tabla.setModel(modvid);
				v.tabla2.setModel(modvid);	
			}
		}
		else if(e.getSource()==v.btneditar)
		{
			if(v.txtedel.getText().isEmpty())
			{
		      JOptionPane.showMessageDialog(null, "TIENE QUE INGRESAR UN VALOR");
			}
			else
			{
				this.cveedit=Integer.parseInt(v.txtedel.getText());
				m.editarvalid(cveedit);	
				if(m.validar==true)
				{
			      v2.setVisible(true);
				  v.setVisible(false);
				}
				else {}
			}
		}
		else if(e.getSource()==v2.btnguardar)
		{
			if(v2.txtnomvid.getText().isEmpty() && v2.txtprov.getText().isEmpty() && v2.txtpre.getText().isEmpty() && v2.txtgen.getText().isEmpty())
			{
				 JOptionPane.showMessageDialog(null, "RELLENE TODOS LOS CAMPOS");
			}
			else
			{
				String nom=v2.txtnomvid.getText();
				int prov=Integer.parseInt(v2.txtprov.getText());
				int cant=Integer.parseInt(v2.txtcant.getText());
				float precio=Float.parseFloat(v2.txtpre.getText());
				String gen=v2.txtgen.getText();
				m.editar(cveedit, nom, prov, gen, precio, cant);
				DefaultTableModel modelo=(DefaultTableModel) v.tabla.getModel();
				DefaultTableModel modvid= m.mostrarvid(modelo);
				v.tabla.setModel(modvid);
				v.tabla2.setModel(modvid);
				v2.setVisible(false);
				v.setVisible(true);
			}	
		}
		else if(e.getSource()==v2.btncancelar)
		{
			v2.setVisible(false);
			v.setVisible(true);
		}
	}
}
