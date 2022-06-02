package Interfaces;

import java.rmi.RemoteException;

public class Rem_Runner {
    public static void main(String[] args) throws RemoteException {
        Signal signal=new Signal();

        signal.setAddress("Kandy");
        signal.setAge(25);
        signal.setData("Hii this is the first message");
        signal.setMobile(782686549);
        signal.setName("Dineth");

        Rem_Implement ri=new Rem_Implement();
        ri.setSignal(signal);
        ri.broadcast();
    }


}
