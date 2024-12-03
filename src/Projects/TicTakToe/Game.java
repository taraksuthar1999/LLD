package Projects.TicTakToe;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int dimension;
    private Board board;
    private Player[] players;

    private List<Move> moves;

    private int nextPlayerIndex;

    private Player winner;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private GameStatus gameStatus;
    private List<Board> boardStatePerMove;

    Game(Builder builder){
        nextPlayerIndex = 0;
        this.dimension = builder.dimension;
        this.board = new Board(this.dimension);
        this.players = builder.getPlayers();
        this.moves = new ArrayList<>();
        this.boardStatePerMove = new ArrayList<>();
        this.gameStatus = GameStatus.INPROGRESS;
    }

    private Game(){}

    static Builder builder(){
        return new Builder();
    }

    public void start(){
        int counter = 0;
        int limit = dimension * dimension;
        int n = players.length;
        int randomPlayerIndex = (int)(n * Math.random());
        while(counter<limit){
            Player currentPlayer = players[(randomPlayerIndex + counter)%n];
            Move move = currentPlayer.makeMove();
            if(!validMove(move)) System.out.println("Invalid move select your move again. \n");
            else {
                Cell cell = board.getCell(move.getRow(),move.getCol()); //move row & col
                cell.setPlayer(move.getPlayer());
                cell.setCellState(CellState.FILLED);
                moves.add(move);
//                if(checkWinner()){
//                    winner = move.getPlayer();
//                    gameStatus = GameStatus.COMPLETE;
//
//                    break;
//                }
                counter++;
            }
//            board.printBoard();
        }
        
    }

    public void printBoard(){
        board.printBoard();
    }

    private boolean validMove(Move move) {
        if(move.getRow() > dimension || move.getCol() > dimension || move.getRow() < 0 || move.getCol() < 0) return false;
        Cell cell = this.board.getCell(move.getRow(),move.getCol());
        if(cell.getCellState() == CellState.FILLED) return false;
        return true;
    }

    static class Builder{

        private int dimension;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        private Board board;

        public Board getBoard() {
            return board;
        }

        public Player[] getPlayers() {
            return players;
        }

        private Player[] players;

        private Move[] moves;

        private Player currentPlayer;

        private Player winner;

        private final GameStatus gameStatus;

        private Board[] boardStatePerMove;

        public Builder setPlayers(Player[] players) {
            this.players = players;
            return this;
        }

        Builder(){
            this.gameStatus = GameStatus.INPROGRESS;
        }


        public Game build(){
            try{
                valid();
                return new Game(this);
            }catch (Exception e){
                System.out.println(e.getMessage());
                return null;
            }
        }

        private void valid() throws Exception{
            if(this.dimension < 3) throw new RuntimeException("3 is the minimum dimension required to play.");
            if(this.players.length < 1) throw new RuntimeException("at least one player required to play.");
        }
    }

}
