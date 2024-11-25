package com.checkers.view;

import com.checkers.model.Player;

public class PlayerView {

    private Player currentPlayer;

    // Конструктор, який ініціалізує поточного гравця
    public PlayerView(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    // Метод для відображення поточного гравця
    public void displayCurrentPlayer() {
        // Виведення в консоль поточного гравця і його кольору
        System.out.println("It's " + currentPlayer.getName() + "'s turn. Player color: " + currentPlayer.getColor());
    }
}
