package Projects.TicTakToe;

public abstract class Player {
    private String name;
    private char symbol;
    private PlayerType playerType;

    Player(String name, char symbol, PlayerType playerType){
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public abstract Move makeMove();

}
