package com.dalin.memoryapp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.media.j3d.Sound;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.sun.media.jfxmediaimpl.platform.Platform;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MemorySpielKarte extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static ImageIcon DEFAULT_IMAGE;

	public static Sound DEFAULT_SOUND;

	private ImageIcon bild;
	private Media soundMedia;
	private MediaPlayer mediaPlayer;
	
	public MemorySpielKarte(String name) {
		bild = new ImageIcon(com.dalin.memoryapp.img.DummyClass.class.getResource(name+".png"));
		this.setIcon(bild);
		this.setText(name);
		
		//soundMedia = new Media(this.getClass().getResource("game-0.mp3").toExternalForm());
		this.init();
	}

	public void init() {
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				javafx.application.Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//mediaPlayer = new MediaPlayer(soundMedia);
						if(mediaPlayer!=null)
							mediaPlayer.play();
						else System.out.println("ERROR: No sound media to play.");
					}
				});
				
				
			}
		});
	}

}

