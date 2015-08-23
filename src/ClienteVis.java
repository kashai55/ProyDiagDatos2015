import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;


public class ClienteVis {
	public ClienteVis() {
	}
	public void enviar() {
		try{
			String ip=InetAddress.getLocalHost().getHostAddress();
			System.out.println("esta es mi ip:  "+ip);
			Socket ClienSo=new Socket(ip,2000) ;
			DataOutputStream DatoaEnviar=new DataOutputStream(ClienSo.getOutputStream());
			DatoaEnviar.writeInt(12);
	//		DatoaEnviar.writeUTF("Eso fue mi fecha de nacimiento");
			ClienSo.close();
		}
		catch(IOException e){
			System.out.println("error en el cliente"+e.getMessage());
			
		}
		}
	}

