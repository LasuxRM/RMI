package interfaz_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazRMI extends Remote{
    
    public String HolaMundo() throws RemoteException;
}
