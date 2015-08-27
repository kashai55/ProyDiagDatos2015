import java.util.Random;
public class DuckCreator{
	int PY1=99;
	int PT1=97;
	int PT2=98;
	int PC1=92;
	int PC2=96;
	int PH1=82;
	int PH2=91;
	int PWd=81;
	public Duck CrearPato(VentanaJuego ventana){
		int rnd = new Random().nextInt(100);
		Duck duck=null;
		if(rnd>=PY1 && rnd<=99){//PYaguasa
			duck = new Yaguasa(ventana);
			System.out.println("soy un pato py");
		}
		if(rnd>=PT1 && rnd<=PT2){//Tarro
			duck = new TarroCanelo(ventana);
			System.out.println("soy un pato tarro");
		}
		if(rnd>=PC1 && rnd<=PC2){//Colo
			duck = new Colorado(ventana);
			System.out.println("soy un pato Colo");
		}
		if(rnd>=PH1 && rnd<=PH2){//HG
			duck = new HawaiianGoose(ventana);
			System.out.println("soy un pato h ");
		}
		if(rnd>=0 && rnd<=PWd){//WD
			duck = new WildDuck(ventana);
			System.out.println("soy un pato w ");
		}
		
		return duck;
	}

	public void CambiarPorcentaje(){
		this.PWd-=4;
		this.PT1-=4;
		this.PY1-=4;
		this.PC1-=4;
		this.PH1-=4;
		this.PT2-=3;
		this.PC2-=3;
		this.PH2-=3;
		
		
	}
	
	
}