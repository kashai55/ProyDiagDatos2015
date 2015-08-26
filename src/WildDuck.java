import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WildDuck extends Duck {
	
	protected int life;
	protected int points;
	protected int speed;
	protected int cta;
	
	private int[] direcciones=new int[2];
	
	
	ImageIcon img01 = new ImageIcon("src/ducks/duckR03.png");
	ImageIcon img02 = new ImageIcon("src/ducks/duckL03.png");//FC
	ImageIcon img03 = new ImageIcon("src/ducks/duckD03.png");
	protected JLabel labelPato=new JLabel(img01);
	
	public WildDuck(VentanaJuego ventana) {
		super(ventana);
		super.setPoints(1);
		super.setResist(1);
		labelGame.add(labelPato);
		labelPato.addMouseListener(this);
		// TODO Auto-generated constructor stub
	}
	
	public void mover(){
		
		direcciones[0]=-5;
		direcciones[1]=5;
		TimerTask task = new TimerTask() {
			int direccionX = direcciones[new Random().nextInt(2)];
			@Override
			public void run() {
				labelPato.setBounds(randomX, randomY, 100, 100);
				if (randomX>1150){labelPato.setIcon(img02);direccionX=-5;}
				else if (randomX<0) {labelPato.setIcon(img01);direccionX=5;}
				randomX+=direccionX;
			}
		};
		timer.schedule(task, 0, 20);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (this.alive==false){return;}
		this.alive=false;
		labelPato.setIcon(img03);;//FC
		Timer timerP = new Timer();
		timer.cancel();
		y = randomY;
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				labelPato.setBounds(randomX, y, 100, 100);
				y = y + 5;
				if (y>600){timerP.cancel();}
			}
		};
		timerP.schedule(task, 0, 35);
		System.out.println("pato clickeado");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	
}