package Projects.TicTakToe;

import javax.swing.text.Style;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Game game;
            System.out.println(" <<Welcome to this new Game of TikTakToe>> ");
//            System.out.print("Enter NO to STOP Playing: ");
//            String continuePlay = s.nextLine().trim();
//            if(continuePlay.equals("NO")) break;
            System.out.println();
            System.out.print("Enter number of Players: ");
            int n = s.nextInt();
            System.out.println();
            Player[] players = new Player[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter your name: ");
                String name = s.next();
                System.out.println();
                System.out.print("Enter your symbol: ");
                String symbol = s.next();
                System.out.println();
                Player player = new HumanPlayer(name, symbol.charAt(0));
                players[i] = player;
            }
            game = Game.builder().setDimension(3).setPlayers(players).build();

            while(game.getGameStatus() == GameStatus.INPROGRESS){

            }

        System.out.println("Thank You For Playing.");
    }
}
