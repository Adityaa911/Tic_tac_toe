package org.example.Strategies.BotPlayingStrategy;

import org.example.Models.Board;
import org.example.Models.Cell;
import org.example.Models.CellState;
import org.example.Models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements  BotplayingStrategy{
    @Override
    public Move makeMove(Board board) {

        for(List<Cell> cells : board.getBoard()){
            for (Cell cell : cells){
                if(cell.getCellState().equals(CellState.Empty)){
                    return new Move(
                            null,
                            cell
                    );
                }
            }
        }
        return null;
    }
}
