package gestor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class VistaPrinsipal extends JFrame
{
	String[] Encabezados= {"clave","Nombre","Provedor","Cantidad","Precio","Genero"};
	JTable tabla, tabla2;
	private JPanel contentPane;
	JButton btnagregar,btncancelar,btnguardar,btneliminar,btneditar;
	JTextField txtnomvid,txtprov,txtcant,txtpre,txtgen,txtedel;
	Thread thv1;
	
	void lanzarGUI()
	{
		
		 thv1 = new Thread(new Runnable() 
		{
			public void run() 
			{
				try {
					crearGUI();
					setVisible(true);
					setSize(1150,550);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 thv1.start();
	}

	public void crearGUI()
	{
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//ESTABLECER LA OPERACION DE SALIDA DEFAULT.(LO DE MAYUSCULAS SON CONSTANTES)
		 //frame
		 Container frame = this.getContentPane();//getCon...:obtener el contenido de el panel.
		 frame.setLayout(null);//null para usar el absolut.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 891, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		///////////////////////////////////////////////////////////
		JTabbedPane tabbedPaneVid = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneVid.setBounds(10, 10, 1100, 550);
		contentPane.add(tabbedPaneVid);
		
		JPanel panelVid = new JPanel();
		tabbedPaneVid.addTab("Videojuegos", null, panelVid, null);
		panelVid.setLayout(null);
		
		JTabbedPane tabbedPane_alta = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_alta.setBounds(0, 0, 1100, 410);
		panelVid.add(tabbedPane_alta);
		
		JPanel panelaltavid = new JPanel();
		tabbedPane_alta.addTab("Alta", null, panelaltavid, null);
		panelaltavid.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 41, 394, 329);
		panelaltavid.add(panel);
		panel.setLayout(null);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel2.setBounds(750, 40, 330, 330);
		panel2.setLayout(null);
		
		JLabel x = new JLabel("ALTA VIDEOJUEGOS");
		x.setBounds(10, 11, 200, 28);
		x.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JPanel panel_gest = new JPanel();
		tabbedPane_alta.addTab("Gestor", null, panel_gest, null);
		panel_gest.setLayout(null);
		panel_gest.add(panel2);
		/////////////////////////////////////////////////////////
		JPanel panelProv = new JPanel();
		tabbedPaneVid.addTab("Proveedores", null, panelProv, null);
		
		JLabel lbesp= new JLabel("RELLENE LOS CAMPOS DE CLICK EN GUARDAR");
		JLabel lbnomvid= new JLabel("Ingrese el nombre");
		JLabel lbprov= new JLabel("seleccione el proveedor");
		JLabel lbcant= new JLabel("Ingrese la cantidad");
		JLabel lbpre= new JLabel("Ingrese el precio");
		JLabel lbgen= new JLabel("Ingrese el genero");
		JLabel lbedel= new JLabel("Ingrese la clave y seleccione Eliminar o Editar");
		//tablas
		DefaultTableModel modelo = new DefaultTableModel(null,Encabezados);
		tabla= new JTable(modelo);
		tabla2= new JTable(modelo);
		tabla.setPreferredScrollableViewportSize(new Dimension(500,300));
		tabla2.setPreferredScrollableViewportSize(new Dimension(500,300));
		DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
		JScrollPane scrollpane = new JScrollPane(tabla);
		JScrollPane scrollpane2 = new JScrollPane(tabla2);
		panelaltavid.add(scrollpane);
		panel_gest.add(scrollpane2);
		
		scrollpane.setBounds(460,40,600,330);
		scrollpane2.setBounds(10,40,700,500);
		txtnomvid= new JTextField(12);
		txtprov= new JTextField(12);
		txtcant= new JTextField(12);
		txtpre= new JTextField(12);
		txtgen= new JTextField(12);
		txtedel= new JTextField(12);
		
		btnagregar = new JButton("Agregar");
		btncancelar = new JButton("Cancelar");
		btnguardar = new JButton("Guardar");
		btneliminar = new JButton("Eliminar videojuego");
		btneditar = new JButton("Editar videojuego");
		
		
		lbesp.setBounds(25,20,350,20);
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
		
		lbedel.setBounds(25,25,300,20);
		txtedel.setBounds(25,90,70,70);
		
		btnguardar.setBounds(25,240,100,30);
		btncancelar.setBounds(180,240,100,30);
		
		btneditar.setBounds(110,90,170,30);
		btneliminar.setBounds(110,130,170,30);
		
		
		panelaltavid.add(x);
		panel.add(lbesp);
		panel.add(lbnomvid);
		panel.add(txtnomvid);
		panel.add(lbprov);
		panel.add(txtprov);
		panel.add(lbcant);
		panel.add(txtcant);
		panel.add(lbpre);
		panel.add(txtpre);
		panel.add(lbgen);
		panel.add(txtgen);
		panel.add(btnguardar);
		panel.add(btncancelar);
		
		panel2.add(lbedel);
		panel2.add(txtedel);
		panel2.add(btneditar);
		panel2.add(btneliminar);
		
	}

	
}
