package org.example.Strategies.WinningStrategy;

import org.example.Models.Board;
import org.example.Models.Move;
import org.example.Models.Player;
import org.example.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{


    private Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();


    @Override
    public Boolean CheckWinner(Board board, Move move) {
        int  row = move.getCell().getRow();
       // int col = move.getCell().getCol();
         Symbol symbol = move.getPlayer().getSymbol();

        if(!rowCounts.containsKey(row)){
            rowCounts.put(row,new HashMap<>());
        }

        Map<Symbol,Integer> rowMap = rowCounts.get(row);

        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol,0);
        }
            rowMap.put(symbol,rowMap.get(symbol)+1);


        if(rowMap.get(symbol).equals(board.getDimension())){
            return true;
        }
        return false;
    }
}
