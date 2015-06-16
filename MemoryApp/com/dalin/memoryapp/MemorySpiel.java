package com.dalin.memoryapp;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

import com.dalin.memoryapp.MemorySpielfeld;

public class MemorySpiel extends JFrame{
	
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
			JButton button = new JButton(new ImageIcon(com.dalin.memoryapp.img.DummyClass.class.getResource("game-"+i+".png")));
			mainPanel.add(button);
		}
		
		this.setLayout(new BorderLayout(2, 2));
		this.getContentPane().add(menuPanel, BorderLayout.NORTH);
		this.getContentPane().add(topPanel, BorderLayout.SOUTH);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		// Alle Spiele ins Fenster hinzufügen
		for(int i=0;i<spiele.length;i++) {
			//this.add(spiele(i));
		}
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void startGame() {
		
	}

}

