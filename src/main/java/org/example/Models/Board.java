package org.example.Models;

import java.util.List;

public class Board {
    public List<List<Cell>> getBoard() {
        return Board;
    }

    public void setBoard(List<List<Cell>> board) {
        Board = board;
    }

    public int getDimension() {
        return Dimension;
    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }

    private int Dimension;
    private List<List<Cell>> Board;

}
