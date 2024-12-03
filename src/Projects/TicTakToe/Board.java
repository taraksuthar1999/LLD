package Projects.TicTakToe;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;
    private int dimension;
    Board(int dimension){
        this.dimension =dimension;
        cells = new ArrayList<>(dimension);
        int i = 0;
        while(cells.size() < dimension){
            List<Cell> row = new ArrayList<>();
            int j = 0;
            while(row.size() < dimension){
                row.add(new Cell(i,j));
                j++;
            }
            cells.add(row);
            i++;
        }
    }

    public Cell getCell(int row, int col){
        return cells.get(row).get(col);
    }

    public void printBoard(){
        System.out.println(" Current Board State");
        for(int i = 0;i<dimension;i++){
            for(int j = 0;j<dimension;j++){
                Cell cell = cells.get(i).get(j);
                char symbol = cell.getCellState() == CellState.FILLED ? cell.getPlayer().getSymbol(): '\u0008';
                System.out.print(" | "+symbol+" | ");
            }
            System.out.println();
        }
    }
}
