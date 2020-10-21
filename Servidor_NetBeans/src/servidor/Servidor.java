package servidor;

import  interfaz_rmi.InterfazRMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements InterfazRMI{
    
    protected Servidor() throws RemoteException{
        super();
    }
    
    public String HolaMundo() throws RemoteException{
        return "Hola Mundo!";
    }
    
    public static void main(String[] args) {
        try {
            Naming.rebind("//localhost/MiServidor", new Servidor());
            System.out.println("Servidor Listo!");
            
        } catch (Exception e) {
            System.err.println("Excepciòn del servidor: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
