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

            System.out.println("Welcome Referee, enter how many rounds of RPS to play");
            Scanner keyboard = new Scanner(System.in);
            int rounds = keyboard.nextInt();
            int p1counter = 0;
            int p2counter = 0;
            for(int i=0; i<rounds; i++) {

                int p1 = stub.shoot();
                int p2 = stub1.shoot();

                if (p1 > p2) {
                    System.out.println("Player 1 wins this round");
                    p1counter = p1counter +1;
                } else if (p1 == p2) {
                    System.out.println("draw");
                } else {
                    System.out.println("Player 2 wins this round");
                    p2counter = p2counter +1;
                }
            }
            if(p1counter>p2counter){
                System.out.println("P1 Wins!");
            }
            else if(p1counter<p2counter){
                System.out.println("P2 Wins!");
            }
            else{
                System.out.println("The tournament is a draw");
            }

            stub.sendResult(p1counter, p2counter);
            stub1.sendResult(p2counter, p1counter);

        }catch (Exception e){System.out.println(e);}
    }
}
