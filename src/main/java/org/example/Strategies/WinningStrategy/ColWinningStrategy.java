package org.example.Strategies.WinningStrategy;

public class ColWinningStrategy implements WinningStrategy{
  HashMap<Integer,Map<Symbol,Integer>> colCounts =new HashMap<>();
    @Override
    public Boolean CheckWinner(Board board, Move move) {
       // int  row = move.getCell().getRow();
         int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!colCounts.containsKey(col)){
            colCounts.put(col,new HashMap<>());
        }

        Map<Symbol,Integer> rowMap = colCounts.get(col);

        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol,0);
        }
        rowMap.put(symbol,rowMap.get(symbol)+1);


        return rowMap.get(symbol).equals(board.getDimension());

    }
}
}
