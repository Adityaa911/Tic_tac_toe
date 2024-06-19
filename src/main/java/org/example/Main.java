package org.example;

import org.example.Controller.GameController;
import org.example.Exceptions.InavalidPlayerCountException;
import org.example.Exceptions.InvalidBotCountException;
import org.example.Exceptions.InvalidMoveException;
import org.example.Models.*;
import org.example.Strategies.WinningStrategy.ColWinningStrategy;
import org.example.Strategies.WinningStrategy.DiagonalWinningStrategy;
import org.example.Strategies.WinningStrategy.RowWinningStrategy;
import org.example.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidBotCountException, InavalidPlayerCountException, InvalidMoveException {

       // Game game = Game.getBuilder().setWinningStrategies(new ArrayList<>()).setPlayers(null).setDimension(3).Build();


        int dimension=3;
        List<Player> players = new ArrayList<>();
      players.add(new Player("Aarna",new Symbol('A'),PlayerType.Human));
        players.add(new Player("Aditya",new Symbol('X'),PlayerType.Human));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        GameController gameController = new GameController();

        Game game = gameController.startGame(
                dimension,
                players,
                winningStrategies
        );

        while(game.getGameState().equals(GameState.In_progress)){
                    // 1. print the board
                    // 2. Ask the usr to choose where they wnat to make a move.
            gameController.PrintBoard(game);
            gameController.makeMove(game);
        }

    }
}