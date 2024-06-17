package org.example.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public Board(int dimension){
        board = new ArrayList<>();

        for (int i = 0;i<dimension;i++){
            board.add(new ArrayList<>());

            for(int j =0;j<dimension;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public  void Print() {
        for (List<Cell> cells : board){
            for (Cell cell : cells) {
                if (cell.getCellState().equals(CellState.Empty)) {
                    ;
                    System.out.print("|  |");
                } else {
                    System.out.print("|" + cell.getPlayer().getSymbol() + "|");
                }
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        board = board;
    }

    public int getDimension() {
        return Dimension;
    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }

    private int Dimension;
    private List<List<Cell>> board;

}
