package examenmedio;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TiendaVideojuegosConInterfazg extends JFrame implements ActionListener
{
	 ArrayList<Videojuego> Almacen = new ArrayList<Videojuego>();
	 int siguiente=0,anterior=0;
	JTextField txtcve,txtnom,txtprov,txtcate,txtprecio,txtnumero,txtinfo,txtborrar,txteditar;
	JButton btnprimero,btnanterior,btnsiguiente,btnultimo,btnnuevo,btnguardar,btneditar,btncancelar,btnborrar,btnsalir,btnacepedicion,btnconfedit,btnconfborrado;
	
	public static void main(String[] args) 
	{
		TiendaVideojuegosConInterfazg tv=new TiendaVideojuegosConInterfazg();
		tv.crearGUI();
		tv.setSize(1100,550);
		tv.setVisible(true);

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
		 JLabel lbborrar= new JLabel("CLAVE DEL VIDEOJUEGO A ELIMINAR");
		 JLabel lbeditar= new JLabel("CLAVE DEL VIDEOJUEGO A EDITAR");
		 
		
		 txtcve= new JTextField(12);
		 txtnom= new JTextField(12);
		 txtprov= new JTextField(12);
		 txtcate= new JTextField(12);
		 txtprecio= new JTextField(12);
		 txtnumero= new JTextField(12);
		 txtinfo= new JTextField(400);
		 txtborrar= new JTextField(12);
		 txteditar= new JTextField(12);
		 
		 
		 btnprimero = new JButton("PRIMERO");
		 btnanterior = new JButton("ANTERIOR");
		 btnsiguiente = new JButton("SIGUIENTE");
		 btnultimo = new JButton("ULTIMO");
		 btnnuevo = new JButton("NUEVO");
		 btnguardar = new JButton("GUARDAR");
		 btneditar = new JButton("AVILITAR ZONA DE EDICION");
		 btnacepedicion = new JButton("CORRIGA LOS CAMPOS A EDITAR Y DE CLICK AQUI");
		 btncancelar = new JButton("CANCELAR");
		 btnborrar = new JButton("AVILITAR ZONA DE ELIMINACION");
		 btnconfedit = new JButton("ACEPTAR");
	     btnconfborrado = new JButton("ACEPTAR");
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
		 txtinfo.setBounds(650,50,350,40);
		 lbeditar.setBounds(600,300,300,40);
		 txteditar.setBounds(830,300,50,40);
		 lbborrar.setBounds(600,360,300,40);
		 txtborrar.setBounds(830,360,50,40);
		 
		 btnprimero.setBounds(600,100,100,30);
		 btnanterior.setBounds(715,100,100,30);
		 btnsiguiente.setBounds(830,100,100,30);
		 btnultimo.setBounds(945,100,100,30);
		 
		 btnnuevo.setBounds(35,290,110,30);
		 btnguardar.setBounds(35,330,110,30);
		 btncancelar.setBounds(35,370,110,30);
		 btneditar.setBounds(300,300,290,40);
		 btnacepedicion.setBounds(25,10,350,20);
		 btnborrar.setBounds(300,360,290,40);
		 btnconfedit.setBounds(900,300,100,40);
		 btnconfborrado.setBounds(900,360,100,40);
		 btnsalir.setBounds(470,450,100,30);
		 
		 
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
		 frame.add(txtinfo);
		 frame.add(txtborrar);
		 frame.add(lbborrar);
		 frame.add(txteditar);
		 frame.add(lbeditar);
		 frame.add(btnprimero);
		 frame.add(btnanterior);
		 frame.add(btnsiguiente);
		 frame.add(btnultimo);
		 frame.add(btnnuevo);
		 frame.add(btnguardar);
		 frame.add(btneditar);
		 frame.add(btnacepedicion);
		 frame.add(btncancelar);
		 frame.add(btnborrar);
		 frame.add(btnsalir);
		 frame.add(btnconfedit);
		 frame.add(btnconfborrado);
		 
		 btnguardar.addActionListener(this);
		 btnnuevo.addActionListener(this);
		 btnprimero.addActionListener(this);
		 btnsiguiente.addActionListener(this);
		 btnanterior.addActionListener(this);
		 btnultimo.addActionListener(this);
		 btnsalir.addActionListener(this);
		 btncancelar.addActionListener(this);
		 btnborrar.addActionListener(this);
		 btneditar.addActionListener(this);
		 btnacepedicion.addActionListener(this);
		 btnconfedit.addActionListener(this);
		 btnconfborrado.addActionListener(this);
		 btnsalir.addActionListener(this);
		 
		 
		 btnguardar.setEnabled(false);
		 btneditar.setEnabled(false);
		 btnacepedicion.setEnabled(false);
		 btnborrar.setEnabled(false);
		 btnguardar.setEnabled(false);
		 btnanterior.setEnabled(false);
		 btnsiguiente.setEnabled(false);
		 btnprimero.setEnabled(false);
		 btnultimo.setEnabled(false);
		 btncancelar.setEnabled(false);
		 txtcve.setEnabled(false);
		 txtnom.setEnabled(false);
		 txtprov.setEnabled(false);
		 txtcate.setEnabled(false);
		 txtprecio.setEnabled(false);
		 txtnumero.setEnabled(false);
		 txtinfo.setEnabled(false);
		 txtborrar.setEnabled(false);
		 btnconfborrado.setEnabled(false);
		 txteditar.setEnabled(false);
		 btnconfedit.setEnabled(false);
		
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==btnnuevo)
		{
			 btnguardar.setEnabled(true);
			 txtcve.setEnabled(true);
			 txtnom.setEnabled(true);
			 txtprov.setEnabled(true);
			 txtcate.setEnabled(true);
			 txtprecio.setEnabled(true);
			 txtnumero.setEnabled(true);
	 
			 btneditar.setEnabled(false);
			 btnborrar.setEnabled(false);
			 btnanterior.setEnabled(false);
			 btnsiguiente.setEnabled(false);
			 btnprimero.setEnabled(false);
			 btnultimo.setEnabled(false);
			 btnsalir.setEnabled(false);
			 btncancelar.setEnabled(true);
			 btnnuevo.setEnabled(false);
		}
		else if(e.getSource()==btnguardar)
		{
			int cve=Integer.parseInt(txtcve.getText());
			String nom=txtnom.getText();
			int prov=Integer.parseInt(txtprov.getText());
			String cate=txtcate.getText();
			float precio=Float.parseFloat(txtprecio.getText());
			int numero=Integer.parseInt(txtnumero.getText());
			Almacen.add(new Videojuego(cve,nom,prov,cate,precio,numero));	
			btnguardar.setEnabled(false);
			 btnnuevo.setEnabled(true);
			 btnanterior.setEnabled(true);
			 btnsiguiente.setEnabled(true);
			 btnprimero.setEnabled(true);
			 btnultimo.setEnabled(true);
			 btneditar.setEnabled(true);
			 btnborrar.setEnabled(true);
			 btnsalir.setEnabled(true);
			 txtinfo.setEnabled(true);
			 btncancelar.setEnabled(false);
			 txtcve.setText(null);
			 txtnom.setText(null);
			 txtprov.setText(null);
			 txtcate.setText(null);
			 txtprecio.setText(null);
			 txtnumero.setText(null);
			 
		}
		else if(e.getSource()==btncancelar)
		{
			 btnguardar.setEnabled(false);
			 btneditar.setEnabled(true);
			 btnprimero.setEnabled(true);
			 btnsiguiente.setEnabled(true);
			 btnanterior.setEnabled(true);
			 btnultimo.setEnabled(true);
			 btnsalir.setEnabled(true);
			 btnnuevo.setEnabled(true);
			 btnborrar.setEnabled(true);
			 btnconfborrado.setEnabled(false);
			 btnconfedit.setEnabled(false);
			 btncancelar.setEnabled(false);
			 txtcve.setText(null);
			 txtnom.setText(null);
			 txtprov.setText(null);
			 txtcate.setText(null);
			 txtprecio.setText(null);
			 txtnumero.setText(null);
			 
			 txtcve.setEnabled(false);
			 txtnom.setEnabled(false);
			 txtprov.setEnabled(false);
			 txtcate.setEnabled(false);
			 txtprecio.setEnabled(false);
			 txtnumero.setEnabled(false);
			 txtborrar.setEnabled(false);
			 txteditar.setEnabled(false);
		}
		else if(e.getSource()==btnborrar)
		{
			 txtborrar.setEnabled(true);
			 btnconfborrado.setEnabled(true);
			 btncancelar.setEnabled(true);
			 btnnuevo.setEnabled(false);
			 btneditar.setEnabled(false);
			 btnanterior.setEnabled(false);
			 btnsiguiente.setEnabled(false);
			 btnprimero.setEnabled(false);
			 btnultimo.setEnabled(false);
			 
		}
		else if(e.getSource()==btnconfborrado)
		{
			 btnnuevo.setEnabled(true);
			 btneditar.setEnabled(true);
			 btnanterior.setEnabled(true);
			 btnsiguiente.setEnabled(true);
			 btnprimero.setEnabled(true);
			 btnultimo.setEnabled(true);
				int elim=-1,i=0;
				int clave=Integer.parseInt(txtcve.getText());
				for(Videojuego v:Almacen)
				{
					if(v.cve_vid==clave)
					{
						elim=i;	
					}
					i++;	
				}
				if(elim==-1)
				{
					JOptionPane.showInputDialog(null,"JUEGO NO ENCONTRADO");
				}
				else 
				{
					Almacen.remove(elim);
				}
			}
			else if(e.getSource()==btnprimero)
			{
				siguiente=0;
				txtinfo.setText(""+Almacen.get(0));
			}
			else if(e.getSource()==btnsiguiente)
			{
				if(siguiente==Almacen.size()-1) 
				{
					siguiente=0;
				}
				else 
				{
					siguiente=siguiente+1;
					
				}
				anterior=siguiente;
				txtinfo.setText(""+Almacen.get(siguiente));
		
		}
		else if(e.getSource()==btnacepedicion)
		{
			 btnborrar.setEnabled(true);
			 btnnuevo.setEnabled(true);
			 btnconfedit.setEnabled(false);
			 btnacepedicion.setEnabled(false);
			 btnanterior.setEnabled(true);
			 btnsiguiente.setEnabled(true);
			 btnprimero.setEnabled(true);
			 btnultimo.setEnabled(true);
			 
			
			int clave=Integer.parseInt(txtcve.getText());
			for(Videojuego v:Almacen)
			{
				if(v.cve_vid==clave)
				{
					int cve=Integer.parseInt(txtcve.getText());
					String nom=txtnom.getText();
					int prov=Integer.parseInt(txtprov.getText());
					String cate=txtcate.getText();
					float precio=Float.parseFloat(txtprecio.getText());
					int numero=Integer.parseInt(txtnumero.getText());
					Almacen.set(Almacen.indexOf(v),new Videojuego(cve,nom,prov,cate,precio,numero));
				}
			}
			JOptionPane.showInputDialog(null,"JUEGO NO ENCONTRADO");
		}
		else if(e.getSource()==btnconfedit)
		{
			 txtcve.setEnabled(true);
			 txtnom.setEnabled(true);
			 txtprov.setEnabled(true);
			 txtcate.setEnabled(true);
			 txtprecio.setEnabled(true);
			 txtnumero.setEnabled(true);
			 btnacepedicion.setEnabled(true);
			
		}
		else if(e.getSource()==btneditar)
		{
			 btncancelar.setEnabled(true);
			 txteditar.setEnabled(true);
			 btnconfedit.setEnabled(true);
			 btnborrar.setEnabled(false);
			 btnnuevo.setEnabled(false);
			 btnanterior.setEnabled(false);
			 btnsiguiente.setEnabled(false);
			 btnprimero.setEnabled(false);
			 btnultimo.setEnabled(false);
			 
		}

		else if(e.getSource()==btnanterior)
		{
			if(anterior==0)
			{
				anterior=Almacen.size()-1;
			}
			else
			{
				anterior=anterior-1;
			}
			siguiente=anterior;
			txtinfo.setText(""+Almacen.get(anterior));
			
		}
		else if(e.getSource()==btnultimo)
		{
			siguiente=0;
			anterior=Almacen.size()-1;
			txtinfo.setText(""+Almacen.get(Almacen.size()-1));
		}
		else if(e.getSource()==btnsalir)
		{
			System.exit(0);
		}
		
	}

}
