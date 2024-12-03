package Projects.TicTakToe;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;

    private Player player;

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }

    Cell(int i, int j){
        row = i;
        col = j;
        cellState = CellState.EMPTY;
    }
}
