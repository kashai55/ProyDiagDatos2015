import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class Servidor implements Runnable{
	
	public Servidor() {
		Thread hilo=new Thread(this);
		hilo.start();
	}
	@Override
	public void run() {
		try {
			ServerSocket SerSo=new ServerSocket(2000);
			Socket Clien;
			while (true){
				System.out.println("en el while");
				Clien=SerSo.accept();
				System.out.println("aceptado");
				DataInputStream DatoaRecibir=new DataInputStream(Clien.getInputStream());
				int DatoRecibido=DatoaRecibir.readInt();
				System.out.println(DatoRecibido);
				if (DatoRecibido>1){
					System.out.println("esto es mayor a 1");
				
				}
				else if (DatoRecibido==0){
					System.out.println("Esto es un cero");
				}
				else{
					System.out.println("Esto es menor a 1");
				}
			}
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en servidor"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
		
	}

}
