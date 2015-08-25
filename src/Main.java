
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator dCreator;
		dCreator = new DuckCreator();
		Duck duck = dCreator.factoryMethod("Yaguasa");
		duck.operation();
		
	}

}
