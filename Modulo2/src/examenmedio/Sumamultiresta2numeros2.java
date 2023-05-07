package examenmedio;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cursodia.java16.mod2.semana1.FormulaConInterfaz;

public class Sumamultiresta2numeros2  extends JFrame implements ActionListener
{
	
	JButton btn40, btn60,btn80,btn100;

	public static void main(String[] args) 
	{
		Sumamultiresta2numeros2 sm2 = new Sumamultiresta2numeros2();
		sm2.crearGUI();
		sm2.setSize(750,450);//300*300: ancho y alto en px.
		sm2.setResizable(false);//no se podra modificar el tamaño de la ventana
		sm2.setVisible(true);//para que se vea

	}
	private void crearGUI()
	{
		//Modificar el contenedor maximo(ventana)
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
				//frame
				Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
				frame.setLayout(null);//null para usar el absolut.
				this.setTitle("botones");
				btn40 = new JButton("act des 2");
				btn60 = new JButton("act des 1");
				btn80 = new JButton("act des 4");
				btn100 = new JButton("act des 3");
				
				btn40.setBounds(250,150,120,30);
				btn60.setBounds(250,190,120,30);
				btn80.setBounds(250,230,120,30);
				btn100.setBounds(250,270,120,30);
				
				frame.add(btn40);
				frame.add(btn60);	
				frame.add(btn80);
				frame.add(btn100);
				
				btn40.addActionListener(this);//este this:buscar en esta clase una accion de evento
				btn60.addActionListener(this);
				btn80.addActionListener(this);
				btn100.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==btn40) 
		{
			if(btn60.isEnabled()) 
			{
				btn60.setEnabled(false);
			}
			else 
			{
				 btn60.setEnabled(true);
			}
			
		}
		else if(e.getSource()==btn60)
		{
			if(btn40.isEnabled()) 
			{
				btn40.setEnabled(false);
			}
			else 
			{
				 btn40.setEnabled(true);
			}
			
		}
		else if(e.getSource()==btn80)
		{
			if(btn100.isEnabled()) 
			{
				btn100.setEnabled(false);
			}
			else 
			{
				 btn100.setEnabled(true);
			}
		}
		else if(e.getSource()==btn100)
		{
			if(btn80.isEnabled()) 
			{
				btn80.setEnabled(false);
			}
			else 
			{
				 btn80.setEnabled(true);
			}
		}
	}

}
