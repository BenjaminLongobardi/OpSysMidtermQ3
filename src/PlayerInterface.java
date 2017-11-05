import java.io.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by benco on 11/5/2017.
 */
public interface PlayerInterface extends Remote{
    public int shoot() throws RemoteException;
    public void sendResult(int n1, int n2) throws RemoteException;
}
