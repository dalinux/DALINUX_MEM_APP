package com.dalin.memoryapp;

/*
 *
 *
 */

import com.dalin.memoryapp.MemorySpiel;

public class MemoryApp {

	/*
	 *
	 *
	 */	

	public MemoryApp() {
		MemorySpiel spiel = new MemorySpiel();
		spiel.startGame();
	}

	/*
	 *
	 *
	 */	
	public static void main(String[] args) {
		new MemoryApp();
	
	}
}

