import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TarroCanelo extends Duck{
	
	
	private int[] direcciones=new int[2];
		
	ImageIcon img01 = new ImageIcon("src/ducks/duckR01.png");
	ImageIcon img02 = new ImageIcon("src/ducks/duckL01.png");//FC
	ImageIcon img03 = new ImageIcon("src/ducks/duckD01.png");
	protected JLabel labelPato=new JLabel(img01);
	
	public TarroCanelo(VentanaJuego ventana) {
		super(ventana);
		super.setPoints(5);
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
				if (randomX>1150){direccionX=-5;
				labelPato.setIcon(img02);//FC
				}
				else if (randomX<0) {direccionX=5;
				labelPato.setIcon(img01);//FC
				}
				randomX+=direccionX;
			}
		};
		timer.schedule(task, 0, 50);
	}
	
	public void mouseClicked(MouseEvent e) {
		if (this.alive==false){return;}
		this.resist-=1;
		if(this.resist==0){
			this.alive=false;
		}
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