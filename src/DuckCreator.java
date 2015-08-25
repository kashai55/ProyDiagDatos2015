
public class DuckCreator extends Creator{
	public Duck factoryMethod(String DuckType){
		
		Duck duck = null;

		
		switch (DuckType){
			case "Colorado": duck= new Colorado();
				break;
			case "HawaiianGoose": duck= new HawaiianGoose();
				break;
			case "TarroCanelo": duck= new TarroCanelo();
				break;
			case "Yaguasa": duck= new Yaguasa();
				break;
			case "WildDuck": duck= new WildDuck();
				break;
			
		}
		return duck;
		
	}
}