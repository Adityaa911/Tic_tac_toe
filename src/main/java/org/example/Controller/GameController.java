package org.example.Controller;

import org.example.Exceptions.InavalidPlayerCountException;
import org.example.Exceptions.InvalidBotCountException;
import org.example.Exceptions.InvalidMoveException;
import org.example.Models.Game;
import org.example.Models.Player;
import org.example.Strategies.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        try {
            return Game.getBuilder().setDimension(dimension)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .Build();
        } catch (InvalidBotCountException | InavalidPlayerCountException e) {
            throw new RuntimeException(e);
        }
    }

    public void PrintBoard(Game game){
        game.PrintBoard();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }
}
