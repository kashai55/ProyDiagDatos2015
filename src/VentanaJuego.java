import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class VentanaJuego extends Interface {
	public VentanaJuego() {
		
		cronometro temporizador = new cronometro();
		temporizador.iniciarActionPerformed(null);
		
		JLabel labelTemp = temporizador.Tiempo;
		
		
		//loading image
		ImageIcon img01 = new ImageIcon("src/fundGame.png");
		ImageIcon img02 = new ImageIcon("src/duck.png");
		
		//layouts
		JFrame frameGame = new JFrame("Game");
		JPanel panelGame = new JPanel();
		JLabel labelGame = new JLabel(img01);
		JLabel labelPato = new JLabel(img02);
		
		
		
		
		buttonBack.setBounds(15, 635, 150, 35);//position button
		buttonBack.addActionListener(new ActionListener() {
			@Override 	 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameGame.setVisible(false);
				frame.setVisible(true);
			}
		});
		
		frame.setVisible(false);
		frameGame.setResizable(false);
		frameGame.add(panelGame);
		frameGame.setVisible(true);
		frameGame.setSize(1240, 720);
		
		labelGame.setBounds(-2, -2, 1240, 720);
		
		
	
		panelGame.setLayout(null);//necesario para dibujar en el panel
		panelGame.add(labelTemp);
		panelGame.add(buttonBack);	
		panelGame.add(labelPato);
		panelGame.add(labelGame);
		
		
		
		labelTemp.setBounds(1000, 10, 100, 100);
		panelGame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		
	    
		int x = 0;
		int y = 0;
		//timer
		Timer timer = new Timer(10000000, null);
		
		timer.setInitialDelay(100);
		
		while (x<100){
			timer.setDelay(10000);
			timer.setInitialDelay(10000);
			timer.start();
			labelPato.setBounds(x, y, 124, 100);
			x = x+1;
			y = y+1;
			
			System.out.println(timer.isRunning());
			panelGame.updateUI();
			
            
		}
		
		
	
	}

}
