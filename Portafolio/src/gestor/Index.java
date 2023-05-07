package gestor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		///////////////////////////////////////////////////////////
		JTabbedPane tabbedPaneVid = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneVid.setBounds(10, 11, 857, 437);
		contentPane.add(tabbedPaneVid);
		
		JPanel panelVid = new JPanel();
		tabbedPaneVid.addTab("Videojuegos", null, panelVid, null);
		panelVid.setLayout(null);
		
		JTabbedPane tabbedPane_alta = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_alta.setBounds(0, 0, 852, 409);
		panelVid.add(tabbedPane_alta);
		
		JPanel panelaltavid = new JPanel();
		tabbedPane_alta.addTab("Alta", null, panelaltavid, null);
		panelaltavid.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 41, 394, 329);
		panelaltavid.add(panel);
		panel.setLayout(null);
		
		JLabel x = new JLabel("ALTA VIDEOJUEGOS");
		x.setBounds(10, 11, 190, 28);
		panelaltavid.add(x);
		x.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		tabbedPane_alta.addTab("Gestor", null, panel_1, null);
		panel_1.setLayout(null);
		/////////////////////////////////////////////////////////
		JPanel panelProv = new JPanel();
		tabbedPaneVid.addTab("Proveedores", null, panelProv, null);
		
	}
}
