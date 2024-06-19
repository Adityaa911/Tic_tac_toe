package org.example.Strategies.BotPlayingStrategy;

import org.example.Models.Board;
import org.example.Models.Move;

public interface BotplayingStrategy {

    Move makeMove(Board board);
}
