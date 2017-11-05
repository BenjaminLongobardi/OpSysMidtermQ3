import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class PlayerImplementation extends UnicastRemoteObject implements PlayerInterface {

    PlayerImplementation() throws RemoteException{
        super();
    }
    //this is the method that asks the user for rock, paper, or scissors, and returns and integer
    //value representing the selection
    public int shoot(){
        try {
            System.out.println("Enter rock paper or scissors");
            Scanner keyboard = new Scanner(System.in);
            while(true){
                String input = keyboard.nextLine();
                if(input.equalsIgnoreCase("rock")){
                    return 0;
                }
                else if(input.equalsIgnoreCase("paper")){
                    return 1;
                }
                else if(input.equalsIgnoreCase("scissors")){
                    return 2;
                }
                else{
                    System.out.println("Enter either rock, paper, or scissors");
                }
            }
        }
        catch(Exception e){System.out.println(e); return -1;}

    }
    public void sendResult(int p1Score, int p2Score){
        if(p1Score>p2Score){
            System.out.println("You Won!");
        }
        else if(p2Score>p1Score){
            System.out.println("You Lost!");
        }
        else{
            System.out.println("There was a tie");
        }
    }


}
