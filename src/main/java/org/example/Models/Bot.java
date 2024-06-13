package org.example.Models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficulty;

    public BotDifficultyLevel getBotDifficulty() {
        return botDifficulty;
    }

    public void setBotDifficulty(BotDifficultyLevel botDifficulty) {
        this.botDifficulty = botDifficulty;
    }
}
