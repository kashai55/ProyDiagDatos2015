import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Random;

abstract class Duck implements MouseListener {
	//protected boolean alive=true;
	protected int resist;
	protected int points;
	protected int movex;
	protected int movey;
	
	public int setPoints(int point){
		return this.points=point;
	}
	public int getPoints(){
		return points;
	}
	public int setResist(int resistp){
		return this.resist=resistp;
	}
	public int getResist(){
		return resist;
	}
	public int setMovex(int x){
		return this.movex=x;
	}
	public int getMovex(){
		return movex;
	}
	public int setMovey(int y){
		return this.movey=y;
	}
	public int getMovey(){
		return movey;
	}

	//protected int cta;
	protected JLabel labelGame;
	ImageIcon img02 = new ImageIcon("src/duck.png");
	protected JLabel labelPato=new JLabel(img02);
	private int[] direcciones=new int[2];
	
	int randomX = new Random().nextInt(1150);
	int randomY = new Random().nextInt(500);
	
	public Duck(VentanaJuego ventana){
		labelGame=ventana.labelGame;
		System.out.println("agregando label");
		labelGame.add(labelPato);
//		labelPato.setBounds(randomX, randomY, 100, 100);
		labelPato.addMouseListener(this);
		
		this.mover();//solo para probar
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
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
		
	public void mover(){
		Timer timer = new Timer();
		direcciones[0]=-5;
		direcciones[1]=5;
		TimerTask task = new TimerTask() {
			int direccionX = direcciones[new Random().nextInt(2)];
			@Override
			public void run() {
				labelPato.setBounds(randomX, randomY, 100, 100);
				if (randomX>1150){direccionX=-5;}
				else if (randomX<0) {direccionX=5;}
				randomX+=direccionX;
			}
		};
		timer.schedule(task, 0, 20);
	}
	
	public abstract void operation();
	
}
