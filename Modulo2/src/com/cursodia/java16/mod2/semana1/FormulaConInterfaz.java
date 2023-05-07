package com.cursodia.java16.mod2.semana1;
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
		fmg.setSize(150,300);//300*300: ancho y alto en px.
		fmg.setResizable(false);//no se podra modificar el tamaño de la ventana
		fmg.setVisible(true);//para que se vea
	}
	
	private void crearGUI()
	{
		//Modificar el contenedor maximo(ventana)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
		//frame
		Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
		frame.setLayout(new FlowLayout());
		
		//Instanciar objetos
		JLabel lba= new JLabel("A");
		JLabel lbb= new JLabel("B");
		JLabel lbc= new JLabel("C");
		JLabel lbx1= new JLabel("X1");
		JLabel lbx2= new JLabel("X2");
		JLabel lbtitulo= new JLabel("FORMULA GENERAL");
		
		txta= new JTextField(12);//12:limite maximo de caracteres VISIBLES
		txtb= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtc= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtx1= new JTextField(12);//limite maximo de caracteres VISIBLES
		txtx2= new JTextField(12);//limite maximo de caracteres VISIBLES
		
		btnCalcular = new JButton("calcular");
		btnNuevo = new JButton("Nuevo");
		
		//agregar los elementos al contenedor (a el frame).
		frame.add(lbtitulo);
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
