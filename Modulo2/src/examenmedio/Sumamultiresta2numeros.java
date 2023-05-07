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

public class Sumamultiresta2numeros  extends JFrame implements ActionListener
{
	JTextField txtresul;
	JButton btn40, btn60,btn80,btn100;
	double resul=0;

	public static void main(String[] args) 
	{
		Sumamultiresta2numeros sm2 = new Sumamultiresta2numeros();
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
				this.setTitle("SUMA RESTA MULTIPLICACION");
				
				//Instanciar objetos
				
				JLabel lbres= new JLabel("RESULTADO");
				
				
				txtresul= new JTextField(12);//limite maximo de caracteres VISIBLE
				
				btn40 = new JButton("+40");
				btn60 = new JButton("+60");
				btn80 = new JButton("-80");
				btn100 = new JButton("-100");
				
				
				
				//posicionar elementos en pantalla
				
				
				lbres.setBounds(425,100,100,30);
				txtresul.setBounds(505,100,100,30);
				
				btn40.setBounds(250,150,120,30);
				btn60.setBounds(250,190,120,30);
				btn80.setBounds(250,230,120,30);
				btn100.setBounds(250,270,120,30);
			
				
				
				
				//agregar los elementos al contenedor (a el frame).
				//frame.add(lbtitulo);
				
				frame.add(lbres);
				frame.add(txtresul);
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
		txtresul.setEditable(false);
		
		
		
		if(e.getSource()==btn40) 
		{
			
			resul=resul+40;
			txtresul.setText(""+resul);
		}
		else if(e.getSource()==btn60)
		{
			resul=resul+60;
			txtresul.setText(""+resul);
			
		}
		else if(e.getSource()==btn80)
		{
			resul=resul-80;
			txtresul.setText(""+resul);
		}
		else if(e.getSource()==btn100)
		{
			resul=resul-100;
			txtresul.setText(""+resul);
		}
		
	}

}
