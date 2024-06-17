package org.example.Models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficulty;

    Bot(String name, Symbol symbol, PlayerType playerType,BotDifficultyLevel botDifficulty) {
        super(name, symbol, PlayerType.Bot);
        this.botDifficulty=botDifficulty;
    }

    public BotDifficultyLevel getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficultyLevel botDifficulty) {
        this.botDifficulty = botDifficulty;
    }
}
