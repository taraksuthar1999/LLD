package JAVA.GuessGame;

import java.util.ArrayList;

public class Game {
    Player p1,p2,p3;

    int computerGuess;

    Game(String name1,String name2, String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    void makeComputerGuess(){
        computerGuess = (int)(Math.random() * 10);
        System.out.println("Computer gussed: "+computerGuess);
    }

    boolean checkWinner(){
        ArrayList<String> winners = new ArrayList<>();
        if(p1.getGuess() == computerGuess) winners.add(p1.name);
        if(p2.getGuess() == computerGuess) winners.add(p2.name);
        if(p3.getGuess() == computerGuess) winners.add(p3.name);
        if(winners.isEmpty()) return false;
        System.out.print("Winners :");
        for(String winner : winners){
            System.out.println(winner+" ");
        }
        System.out.println();
        return true;
    }

    void launch(){
        makeComputerGuess();
        while(true){
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            if(checkWinner()){
                break;
            }else makeComputerGuess();
        }
    }
}
