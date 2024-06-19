package org.example.Strategies.WinningStrategy;

import org.example.Models.Board;
import org.example.Models.Move;
import org.example.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{


    private Map<Integer, Map<Symbol, Integer>> colCounts = new HashMap<>();
    @Override
    public Boolean CheckWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!colCounts.containsKey(col)){
            colCounts.put(col,new HashMap<>());
        }
            Map<Symbol,Integer> colMap = colCounts.get(col);

        if(!colMap.containsKey(symbol)){
           colMap.put(symbol,0);
        }
            colMap.put(symbol,colMap.get(symbol)+1);


        if (colMap.get(symbol).equals(board.getDimension())){
            return true;
        }
      return false;
    }
}
