package org.example.Strategies.WinningStrategy;

import org.example.Models.Board;
import org.example.Models.Move;
import org.example.Models.Player;

public interface WinningStrategy {

    Boolean CheckWinner(Board board, Move move);
}
