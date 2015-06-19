package com.dalin.memoryapp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.*;

import com.dalin.memoryapp.MemorySpielfeld;

public class MemorySpiel extends JFrame{
	
	/**
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel menuPanel = new JPanel(),
				   topPanel = new JPanel(),
				   mainPanel = new JPanel();

	private MemorySpielfeld[] spiele = {
					new MemorySpielfeld("Tiere"),
					new MemorySpielfeld("Pflanzen"),
					new MemorySpielfeld("Farben"),
					new MemorySpielfeld("Geometrie"),
					new MemorySpielfeld("Alphabet"),
					};

	public MemorySpiel() {
		init();
	}

	public void init() {
		this.setTitle("Memory App");
		this.setSize(400, 640);
		menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuPanel.add(new JButton("Hallo"));
		topPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		topPanel.add(new JButton("World"));
		mainPanel.setLayout(new GridLayout(3, 1));
		for(int i=0;i<9;i++) {
			MemorySpielKarte msk = new MemorySpielKarte("game-"+i);
			
			//JButton button = new JButton(new ImageIcon(com.dalin.memoryapp.img.DummyClass.class.getResource("game-"+i+".png")));
			mainPanel.add(msk);
			
		}
		
		this.setLayout(new BorderLayout(2, 2));
		this.getContentPane().add(menuPanel, BorderLayout.NORTH);
		this.getContentPane().add(topPanel, BorderLayout.SOUTH);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		// Alle Spiele ins Fenster hinzuf��gen
		for(int i=0;i<spiele.length;i++) {
			//this.add(spiele(i));
		}
		
		this.setLocation(MemorySpiel.toScreenCenter(this.getSize()));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void startGame() {
		
	}
	
	public static Point toScreenCenter (Dimension dim)
	   {
	      Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
	      if (screenDim.getWidth() < dim.getWidth())
	      {
	         dim.width = (int) screenDim.getWidth();
	      }
	      if (screenDim.getHeight() < dim.getHeight())
	      {
	         dim.height = (int) screenDim.getHeight();
	      }
	      return new Point ( (screenDim.width - dim.width) / 2,
	          (screenDim.height - dim.height) / 2);
	   }

}

