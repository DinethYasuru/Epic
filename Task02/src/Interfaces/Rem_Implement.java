package Interfaces;

import java.rmi.RemoteException;

public class Rem_Implement implements Rem {
     Signal signal=null;

    @Override
    public Signal broadcast() throws RemoteException {
        return this.signal;
    }

    @Override
    public void setSignal(Signal signal) {
        this.signal=signal;
    }
}
