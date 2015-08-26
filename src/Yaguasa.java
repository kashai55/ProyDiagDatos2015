import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Yaguasa extends Duck{
	public Yaguasa(VentanaJuego ventana) {
		super(ventana);
		labelGame.add(labelPato);
		labelPato.addMouseListener(this);
	}

	int point=25;
	int resist=5;
	int x=10;
	int y=50;
	
	
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
		timer.schedule(task, 0, 20);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		labelPato.setIcon(img03);;//FC
	//	labelGame.add(labelPatoMuerto);//FC
	//	labelPatoMuerto.setBounds(randomX, randomY, 100, 100);//FC
		Timer timerP = new Timer();
		y = randomY;
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				labelPato.setBounds(randomX, y, 100, 100);
				y = y + 5;
				timer.cancel();
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


	
	public void operation() {
			setPoints(point);
			setResist(resist);
			setMovex(x);
			setMovey(y);
			System.out.println(getPoints());
			System.out.println(getResist());
			System.out.println("soy un pato yagua");
	
	}
}
