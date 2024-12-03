package JAVA.GuessGame;

public class Player {
    public String name;
    private int guess;
    Player(String name){
        this.name = name;
    }

    public void makeGuess(){
        guess = (int) (Math.random() * 10);
        System.out.println("Payer "+name+" guessed: "+guess);
    }

    public int getGuess(){ return this.guess;}

}
