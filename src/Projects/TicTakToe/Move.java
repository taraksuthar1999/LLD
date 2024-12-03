package Projects.TicTakToe;

public class Move {
    private int row;
    private int col;

    private Player player;

    Move(int row, int col, Player player){
        this.row = row;
        this.col = col;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return player;
    }
}
