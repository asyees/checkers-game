package com.checkers.view;

import com.checkers.model.Game;
import com.checkers.model.Player;
import com.checkers.model.Board;

public class GameView {

    private BoardView boardView;
    private PlayerView playerView;
    private MessageView messageView;

    public GameView(Game game) {
        boardView = new BoardView(game.getBoard());
        playerView = new PlayerView(game.getCurrentPlayer());
        messageView = new MessageView();
    }

    public void displayGameState() {
        boardView.displayBoard();
        playerView.displayCurrentPlayer();
        messageView.displayMessage("Game in progress...");
    }

    public void displayWinner(Player winner) {
        messageView.displayMessage("Player " + winner.getName() + " wins!");
    }
}
