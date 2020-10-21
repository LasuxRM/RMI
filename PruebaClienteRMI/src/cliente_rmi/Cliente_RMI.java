package cliente_rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import interfaz_rmi.InterfazRMI;

public class Cliente_RMI {
	
	private static InterfazRMI mirar;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		mirar = (InterfazRMI) Naming.lookup("//192.168.0.10/MiServidor");
		String respuesta = mirar.HolaMundo();
		
		System.out.println(respuesta);
	}

}
