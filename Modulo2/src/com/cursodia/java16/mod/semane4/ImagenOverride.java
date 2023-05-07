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
import java.awt.Graphics2D;

public class ImagenOverride extends JFrame implements ActionListener
{
	JButton btnmostar;
	MiPanel panel;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImagenOverride frame = new ImagenOverride();
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
	public ImagenOverride() {
		setTitle("mostar iagen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panel = new MiPanel();
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
		BufferedImage img;
		try {
			
			img = ImageIO.read(getClass().getResource("/foti.jpg"));
			Graphics2D g2img = img.createGraphics();
			panel.buffer=img;
			panel.canvas=g2img;
			panel.paintComponent(panel.getGraphics());
			Graphics papel= panel.getGraphics();
			papel.drawImage(img,0,0,500,280,null);
		} catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
	
	public class MiPanel extends JPanel
	{
		BufferedImage buffer;
		Graphics2D canvas;
		
		@Override 
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			if(buffer==null)
			{
				buffer = new BufferedImage(getWidth(),getHeight(),BufferedImage.TYPE_INT_RGB);
				canvas = buffer.createGraphics();		
			}
			g.drawImage(buffer,0,0,this);
		}
		
		
	}
}

