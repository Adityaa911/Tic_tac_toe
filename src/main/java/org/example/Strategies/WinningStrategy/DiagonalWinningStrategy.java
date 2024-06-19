package org.example.Strategies.WinningStrategy;

import org.example.Models.Board;
import org.example.Models.Move;
import org.example.Models.Symbol;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy {

    HashMap<Symbol, Integer> leftdiagonal = new HashMap<>();
    HashMap<Symbol, Integer> rightdiagonal = new HashMap<>();

    @Override
    public Boolean CheckWinner(Board board, Move move) {


        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if (row == col) {
            if (!leftdiagonal.containsKey(symbol)) {
                leftdiagonal.put(symbol, 0);
            }
            leftdiagonal.put(symbol, leftdiagonal.get(symbol) + 1);

        return leftdiagonal.get(symbol).equals(board.getDimension());
    }

        if(row +col == board.getDimension()-1){
            if (!rightdiagonal.containsKey(symbol)){
                rightdiagonal.put(symbol,0);
            }
            rightdiagonal.put(symbol,rightdiagonal.get(symbol)+1);

            return rightdiagonal.get(symbol).equals(board.getDimension());

}
        return false;

    }
}
