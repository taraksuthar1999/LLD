package Projects.TicTakToe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HumanPlayer extends Player {

    HumanPlayer(String name, char symbol){
        super(name,symbol,PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your move:- ");
        System.out.print("Select row number: ");
        int row = sc.nextInt();
        System.out.println();
        System.out.print("Select col number: ");
        int col = sc.nextInt();
        System.out.println("move recorded");
        return new Move(row,col,this);
    }
}
