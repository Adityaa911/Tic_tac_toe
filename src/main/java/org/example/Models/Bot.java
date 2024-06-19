package org.example.Models;

import org.example.Factory.BotPlayingDifficultFactory;
import org.example.Strategies.BotPlayingStrategy.BotplayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficulty;
    private BotplayingStrategy botplayingStrategy;

   public Bot(String name, Symbol symbol, PlayerType playerType,BotDifficultyLevel botDifficulty,BotplayingStrategy botplayingStrategy) {
        super(name, symbol, PlayerType.Bot);
        this.botDifficulty=botDifficulty;
        this.botplayingStrategy = BotPlayingDifficultFactory.botPlayingStrategy(botDifficulty);
    }

    public BotDifficultyLevel getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficultyLevel botDifficulty) {
        this.botDifficulty = botDifficulty;
    }

     public Move makeMove(Board board){
        Move move = botplayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
     }


}
