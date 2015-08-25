import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;


public class VentanaJuego extends Interface {
	
	//components

	//loading image
	ImageIcon img01 = new ImageIcon("src/fundGame.png");
	ImageIcon img02 = new ImageIcon("src/duck.png");
	
	//layouts
	JFrame frameGame = new JFrame("Game");
	JPanel panelGame = new JPanel();
	JLabel labelGame = new JLabel(img01);
	JLabel labelPato = new JLabel(img02);
	
	public VentanaJuego() {
		
		//temporizador
		cronometro temporizador = new cronometro();
		temporizador.iniciarActionPerformed(null);
		JLabel labelTemp = temporizador.Tiempo;
		
		//event back
		buttonBack.setBounds(15, 635, 150, 35);//position button
		buttonBack.addActionListener(new ActionListener() {
			@Override 	 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameGame.setVisible(false);
				frame.setVisible(true);
			}
		});
		
		//frame add complements
		frame.setVisible(false);
		frameGame.setResizable(false);
		frameGame.add(panelGame);
		frameGame.setVisible(true);
		frameGame.setSize(1240, 720);
		
		//position fundGame
		labelGame.setBounds(-2, -2, 1240, 720);
		
		
		//panel options, add complements
		panelGame.setLayout(null);//necesario para dibujar en el panel
		//panelGame.add(labelTemp);
		//panelGame.add(buttonBack);	
		//panelGame.add(labelPato);
		//panelGame.add(labelGame);
		panelGame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		//position temp
		labelTemp.setBounds(1000, 10, 100, 100);
		panelGame.add(labelPato);
		labelPato.setBounds(0, 0, 100, 100);

		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			int x = 0;
			int direccion = 5;
			@Override
			public void run() {
				labelPato.setBounds(x, 0, 100, 100);
				if (x>1150){direccion=-5;}
				else if (x<0) {direccion=5;}
				x+=direccion;
			}
		
		
		};
		timer.schedule(task, 0, 20);
	}
	
	
	
//	public void iniciar(){
//		while(x < 10){
//			timer.setDelay(200);
//			x = x + 1;
//			
//		}
//		timer.setRepeats(false);
//		timer.start();
//            
//	
//		};
	
	

}
