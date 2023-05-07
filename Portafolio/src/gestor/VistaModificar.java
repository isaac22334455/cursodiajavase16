package gestor;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class VistaModificar extends JFrame
{
	JButton btncancelar,btnguardar;
	JTextField txtnomvid,txtprov,txtcant,txtpre,txtgen,txtedel;
	private JPanel contentPane;
	Thread thv2;
	void lanzarGUI()
	{
		thv2 = new Thread(new Runnable() 
		{
			public void run() 
			{
				try {
					crearGUI();
					setVisible(false);
					setSize(350,350);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 thv2.start();
	}
	public void crearGUI()
	{
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbtit = new JLabel("SECCION DE EDICION");
		lbtit.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lbtit.setBounds(10, 11, 228, 24);
		contentPane.add(lbtit);
		
		JLabel lbesp= new JLabel("RELLENE LOS CAMPOS DE CLICK EN GUARDAR");
		JLabel lbnomvid= new JLabel("Ingrese el nombre");
		JLabel lbprov= new JLabel("seleccione el proveedor");
		JLabel lbcant= new JLabel("Ingrese la cantidad");
		JLabel lbpre= new JLabel("Ingrese el precio");
		JLabel lbgen= new JLabel("Ingrese el genero");
		
		txtnomvid= new JTextField(12);
		txtprov= new JTextField(12);
		txtcant= new JTextField(12);
		txtpre= new JTextField(12);
		txtgen= new JTextField(12);
		
		btncancelar = new JButton("Cancelar");
		btnguardar = new JButton("Guardar");
		
		lbnomvid.setBounds(25,50,150,20);
		txtnomvid.setBounds(180,50,100,20);
		lbprov.setBounds(25,80,150,20);
		txtprov.setBounds(180,80,100,20);
		lbcant.setBounds(25,110,150,20);
		txtcant.setBounds(180,110,100,20);
		lbpre.setBounds(25,140,150,20);
		txtpre.setBounds(180,140,100,20);
		lbgen.setBounds(25,170,150,20);
		txtgen.setBounds(180,170,100,20);
		
		btnguardar.setBounds(25,240,100,30);
		btncancelar.setBounds(180,240,100,30);
		
		contentPane.add(lbnomvid);
		contentPane.add(txtnomvid);
		contentPane.add(lbprov);
		contentPane.add(txtprov);
		contentPane.add(lbcant);
		contentPane.add(txtcant);
		contentPane.add(lbpre);
		contentPane.add(txtpre);
		contentPane.add(lbgen);
		contentPane.add(txtgen);
		contentPane.add(btnguardar);
		contentPane.add(btncancelar);
		
		
	}

}
