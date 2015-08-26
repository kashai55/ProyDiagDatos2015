import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Random;

abstract class Duck implements MouseListener {
	protected boolean alive=true;
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
	ImageIcon img02 = new ImageIcon("src/ducks/duckR01.png");
	ImageIcon img03 = new ImageIcon("src/ducks/duckL01.png");//FC
	ImageIcon img04 = new ImageIcon("src/ducks/duckD01.png");//FC
	
	private int[] direcciones=new int[2];
	
	int randomX = new Random().nextInt(1150);
	int randomY = new Random().nextInt(500);
	int y;
	Timer timer = new Timer();
	
	public Duck(VentanaJuego ventana){
		labelGame=ventana.labelGame;
	}
	
	public void mover(){}
	
	public abstract void operation();
	
}
