/**
 * Created by benco on 11/5/2017.
 */
import java.rmi.*;
public class Player2 {
    public static void main(String [] args)throws RemoteException{
        try{
            PlayerInterface stub = new PlayerImplementation();
            Naming.rebind("rmi://localhost:5000/rockpaperscissors2", stub);

        }catch(Exception e){System.out.println(e);}
    }
}
