package com.checkers.view;

public class MessageView {

    public void displayMessage(String message) {
        System.out.println(message); // Виведення повідомлень у консоль
    }

    public void displayError(String errorMessage) {
        System.err.println("Error: " + errorMessage); // Виведення помилок
    }

    public void displayGameStartMessage() {
        System.out.println("Game has started! Good luck!");
    }

    public void displayGameOverMessage() {
        System.out.println("Game over!");
    }
}
