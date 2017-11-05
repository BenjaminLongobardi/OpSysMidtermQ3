/**
 * Created by benco on 11/5/2017.
 */
import java.rmi.*;
import java.util.Scanner;
public class Referee {
    public static void main(String [] args)throws RemoteException{
        try {
            PlayerInterface stub = (PlayerInterface) Naming.lookup("rmi://localhost:5000/rockpaperscissors1");
            PlayerInterface stub1 = (PlayerInterface) Naming.lookup("rmi://localhost:5000/rockpaperscissors2");



            int p1 = stub.shoot();
            int p2 = stub1.shoot();

            if(p1>p2){
                System.out.println("Player 1 wins");
            }
            else if(p1==p2){
                System.out.println("draw");
            }
            else
                System.out.println("Player 2 wins");
        }catch (Exception e){System.out.println(e);}
    }
}
