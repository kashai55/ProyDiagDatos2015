
public class DuckCreator extends Creator{
	public Duck factoryMethod(int DuckType, VentanaJuego ventana){
		
		Duck duck = null;

		
		switch (DuckType){
			case 1 : duck= new Colorado(ventana);
				break;
			case 2: duck= new HawaiianGoose(ventana);
				break;
			case 3: duck= new TarroCanelo(ventana);
				break;
			case 4: duck= new Yaguasa(ventana);
				break;
			case 5: duck= new WildDuck(ventana);
				break;
			
		}
		return duck;
		
	}
}