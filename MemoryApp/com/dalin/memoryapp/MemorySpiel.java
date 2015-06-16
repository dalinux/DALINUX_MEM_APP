package com.dalin.memoryapp;

import javax.swing.*;
import com.dalin.memoryapp.MemorySpielfeld;

public class MemorySpiel extends JFrame{

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
		// Alle Spiele ins Fenster hinzufügen
		for(int i=0;i<spiele.length;i++) {
			//this.add(spiele(i));
		}
		
	}
	
	public void startGame() {
		
	}

}

