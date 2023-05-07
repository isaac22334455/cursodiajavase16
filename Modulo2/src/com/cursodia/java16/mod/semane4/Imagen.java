package com.cursodia.java16.mod.semane4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;

public class Imagen extends JFrame implements ActionListener
{
	JButton btnmostar;
	JPanel panel;

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagen frame = new Imagen();
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
	public Imagen() {
		setTitle("mostar iagen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(45, 26, 500, 280);
		contentPane.add(panel);
		
		btnmostar = new JButton("mostar");
		btnmostar.addActionListener(this);
		btnmostar.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnmostar.setBounds(279, 358, 173, 36);
		contentPane.add(btnmostar);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		BufferedImage img = null;
		Graphics papel= panel.getGraphics();
		
		try {
			img= ImageIO.read(new File("imagenes/foti.jpg"));
			papel.drawImage(img,0,0,500,280,null);
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		}
	}
}
