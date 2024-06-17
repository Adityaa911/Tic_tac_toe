package org.example.Models;

import org.example.Exceptions.InavalidPlayerCountException;
import org.example.Exceptions.InvalidBotCountException;
import org.example.Strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int NextPlayerMove;
    private List<WinningStrategy> winningStrategies;


    private Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies){
       this.players = players;
       this.winningStrategies = winningStrategies;
       this.moves = new ArrayList<>();
       this.board = new Board(dimension);
       this.gameState =GameState.In_progress;
       this.NextPlayerMove=0;
    }



    public static Builder getBuilder(){
        return new Builder();
    }

    public void PrintBoard(){
        board.Print();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMove() {
        return NextPlayerMove;
    }

    public void setNextPlayerMove(int nextPlayerMove) {
        NextPlayerMove = nextPlayerMove;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }


    public static class Builder{
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setDimension(int i) {
            this.dimension = dimension;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private List<Player> players;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        private void BotcountValidate() throws InvalidBotCountException {
            int botCount = 0;

            for(Player player:players){
                if (player.getPlayerType().equals(PlayerType.Bot)){
                    botCount++;
                }
            }
            if(botCount > 1){
            throw new InvalidBotCountException("No more than 1 Bot is allowed");
            }
        }

        private void PlayerCountValidate() throws InavalidPlayerCountException {
            if(players.size() != dimension - 1){
                throw new InavalidPlayerCountException("no of player should be less than dimension 1");
            }
        }

//        private void ValidateUniquePlayerSymbol() {
//
//            Set<Character> symbolsmap = new HashSet<>();
//
//            for (Player player : players) {
//                char symbol = player.getSymbol();
//                if (symbolsmap.contains(symbol)) {
//                    throw new InvalidUniquePlayerSymbolException("no 2 palyer have same symbol");
//                }
//        }


        private void validate() throws InvalidBotCountException, InavalidPlayerCountException {
            BotcountValidate();
            PlayerCountValidate();
         //   ValidateUniquePlayerSymbol();
        }



        public Game Build() throws InvalidBotCountException, InavalidPlayerCountException {


            validate();

            return new Game(
                    dimension,
                    players,
                    winningStrategies
            );
        }
    }
}
