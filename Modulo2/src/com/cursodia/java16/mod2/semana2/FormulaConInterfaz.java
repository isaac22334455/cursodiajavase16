package com.cursodia.java16.mod2.semana2;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormulaConInterfaz extends JFrame implements ActionListener
{
	JTextField txta,txtb,txtc,txtx1,txtx2;
	JButton btnCalcular, btnNuevo;

	public static void main(String[] args) 
	{
		FormulaConInterfaz fmg = new FormulaConInterfaz();
		fmg.crearGUI();
		fmg.setSize(450,250);//300*300: ancho y alto en px.
		fmg.setBounds(800,400,450,250);//posicion de el JFrame(ventana) en pantalla
		//fmg.setResizable(false);//no se podra modificar el tamaño de la ventana
		fmg.setVisible(true);//para que se vea
	}
	
	private void crearGUI()
	{
		//Modificar el contenedor maximo(ventana)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
		//frame
		Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
		frame.setLayout(null);//null para usar el absolut.
		this.setTitle("CALCULO FORMULA GENERAL");
		
		//Instanciar objetos
		JLabel lba= new JLabel("A");
		JLabel lbb= new JLabel("B");
		JLabel lbc= new JLabel("C");
		JLabel lbx1= new JLabel("X1");
		JLabel lbx2= new JLabel("X2");
		//JLabel lbtitulo= new JLabel("FORMULA GENERAL");
		

		txta= new JTextField(12);//12:limite maximo de caracteres VISIBLES
		txtb= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtc= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtx1= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtx2= new JTextField(12);//limite maximo de caracteres VISIBLES
		
		btnCalcular = new JButton("calcular");
		btnNuevo = new JButton("Nuevo");
		
		//posicionar elementos en pantalla
		lba.setBounds(25,25,10,10);
		txta.setBounds(40,25,100,15);
		
		lbb.setBounds(160,25,20,10);
		txtb.setBounds(175,25,100,15);
		
		lbc.setBounds(295,25,20,10);
		txtc.setBounds(310,25,100,15);
		
		lbx1.setBounds(25,50,20,10);
		txtx1.setBounds(40,50,100,15);
		
		lbx2.setBounds(160,50,20,10);
		txtx2.setBounds(175,50,100,15);
		
		btnCalcular.setBounds(40,70,100,20);
		btnNuevo.setBounds(175,70,100,20);
		
		
		
		
		//agregar los elementos al contenedor (a el frame).
		//frame.add(lbtitulo);
		frame.add(lba);
		frame.add(txta);
		frame.add(lbb);
		frame.add(txtb);
		frame.add(lbc);
		frame.add(txtc);
		frame.add(lbx1);
		frame.add(txtx1);
		frame.add(lbx2);
		frame.add(txtx2);
		frame.add(btnCalcular);	
		frame.add(btnNuevo);	
		
		//agregar escuchadores
		btnCalcular.addActionListener(this);//este this:buscar en esta clase una accion de evento
		btnNuevo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnCalcular)
		{
		double a=Double.parseDouble(txta.getText());
		double b=Double.parseDouble(txtb.getText());
		double c=Double.parseDouble(txtc.getText());
		double radical =Math.pow(b, 2)-(4*a*c);
			if(radical>=0)
			{
				radical=Math.sqrt(radical);
				double x1= (-b+radical)/(2*a);
				double x2= (-b-radical)/(2*b);
				txtx1.setText(""+x1);
				txtx2.setText(""+x2);
				desactivar();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "no se pueden calcular raizes imaginarias");
			}
		}
		else if(e.getSource()==btnNuevo)
		{
			activar();
			
		}
		
		
	}
	private void desactivar()
	{
		txtx1.setEditable(false);
		txtx2.setEditable(false);
		txta.setEditable(false);
		txtb.setEditable(false);
		txtc.setEditable(false);
	}
	
	private void activar()
	{
		txtx1.setEditable(true);
		txtx2.setEditable(true);
		txta.setEditable(true);
		txtb.setEditable(true);
		txtc.setEditable(true);
		txtx1.setText("");
		txtx2.setText("");
		txta.setText("");
		txtb.setText("");
		txtc.setText("");
		
	}

}
