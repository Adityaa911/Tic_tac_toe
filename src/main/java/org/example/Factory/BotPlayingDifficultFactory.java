package org.example.Factory;

import org.example.Models.BotDifficultyLevel;
import org.example.Strategies.BotPlayingStrategy.BotplayingStrategy;
import org.example.Strategies.BotPlayingStrategy.EasyBotPlayingStrategy;
import org.example.Strategies.BotPlayingStrategy.HardPlayingStrategy;
import org.example.Strategies.BotPlayingStrategy.MediumPlayingStrategy;

public class BotPlayingDifficultFactory {

    public static BotplayingStrategy botPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {

        if (botDifficultyLevel.equals(BotDifficultyLevel.Easy)) {
            return new EasyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.Hard)) {
            return new HardPlayingStrategy();
        } else {
            return new MediumPlayingStrategy();
        }

    }

}
