package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Rem extends Remote {
    public Signal broadcast ()throws RemoteException;
    public void setSignal(Signal signal);
}
