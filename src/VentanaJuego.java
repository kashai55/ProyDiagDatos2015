import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.Timer;
import java.util.TimerTask;


public class VentanaJuego extends Interface {
	
	//components

	//loading image
	ImageIcon img01 = new ImageIcon("src/fundGame.png");
	
	//layouts
	JFrame frameGame = new JFrame("Game");
	JLabel labelGame = new JLabel(img01);
	JButton buttonBack = new JButton("Back to Menu");
	
	
	cronometro temporizador = new cronometro();
	
	public VentanaJuego() {
		Duck[] lista=new Duck[20];
		//frame add complements
		frame.setVisible(false);
		frameGame.setResizable(false);
		frameGame.setVisible(true);
		frameGame.setSize(1240, 720);
		
		//temporizador
		temporizador.iniciarActionPerformed(null);
		JLabel labelTemp = temporizador.Tiempo;
		labelGame.add(labelTemp).setBounds(1100, 10, 100, 50);
		
		//event back
		labelGame.add(buttonBack).setBounds(15, 635, 150, 35);//position button
		buttonBack.addActionListener(new ActionListener() {
			@Override 	 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameGame.dispose();
				frame.setVisible(true);
			}
		});
		
		//add complements
		frameGame.add(labelGame).setBounds(-2, -2, 1240, 720);	
		labelGame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		lista[0]=new Colorado(this);
		
	}
	
	public void iniciar(){
		new Colorado(this);
		System.out.println("despues de pato");
	}
}

