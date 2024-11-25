package com.checkers.model;

public class Game {

    private Board board; // Дошка для гри
    private Player currentPlayer; // Поточний гравець
    private Player player1;
    private Player player2;

    // Конструктор
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board(8, 8); // Наприклад, стандартна дошка 8x8
        this.currentPlayer = player1; // Починає перший гравець
    }

    // Метод для отримання дошки
    public Board getBoard() {
        return board;
    }

    // Метод для отримання поточного гравця
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    // Метод для зміни поточного гравця
    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    // Метод для перевірки переможця (приклад, який можна адаптувати)
    public Player checkWinner() {
        // Логіка перевірки переможця
        return null; // Якщо немає переможця, повертається null
    }
}
