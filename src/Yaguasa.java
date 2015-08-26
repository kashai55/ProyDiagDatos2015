import java.util.Timer;
import java.util.TimerTask;

public class Yaguasa extends Duck{
	public Yaguasa(VentanaJuego ventana) {
		super(ventana);
	}

	int point=25;
	int resist=5;
	int x=10;
	int y=50;
	
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
