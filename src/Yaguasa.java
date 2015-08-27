import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Yaguasa extends Duck{
	    int Takep=5;
	public Yaguasa(VentanaJuego ventana) {
		super(ventana);
		super.setPoints(25);
		super.setResist(1);
		labelGame.add(labelPato);
		labelPato.addMouseListener(this);
	}
		
	private int[] direcciones=new int[2];
	
	ImageIcon img01 = new ImageIcon("src/ducks/duckR04.png");
	ImageIcon img02 = new ImageIcon("src/ducks/duckL04.png");//FC
	ImageIcon img03 = new ImageIcon("src/ducks/duckD04.png");
	protected JLabel labelPato=new JLabel(img01);
	
	public static void iniciar() {
	    Timer timer;
	    timer = new Timer();

	    TimerTask task = new TimerTask() { //aqui se declara la tarea que se va a realizar cada cierto tiempo
	    	int i=0;
	        public void run(){
	        	System.out.println(i);
	        	i++;
	        	if (i==31){System.out.print("Im dead");timer.cancel();}
	        	
	        }
	    };
	    
	    timer.schedule(task,0,1000); //task es la tarea a realizar, 0 son los milisegundos que espera antes de realizar la tarea y 1000 es la cantidad de milisegundos que espera antes de volver a hacer la tarea especificada
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
		timer.schedule(task, 0, 3);
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

