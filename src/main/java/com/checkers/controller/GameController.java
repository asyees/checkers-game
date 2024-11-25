package com.checkers.controller;

import com.checkers.model.Board;
import com.checkers.model.Player;
import com.checkers.util.LoggerUtil;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Logger;

public class GameController {
    private static final Logger logger = Logger.getLogger(GameController.class.getName());
    private Board board;            // Дошка гри
    private Player humanPlayer;     // Гравець людина
    private Player computerPlayer;  // Гравець комп'ютер
    private Player currentPlayer;   // Поточний гравець
    private boolean gameOver;       // Статус гри (чи завершена вона)
    private ResourceBundle messages; // Ресурс для багатомовності

    public GameController(Player humanPlayer, Player computerPlayer, Locale locale) {
        this.board = new Board();
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.currentPlayer = humanPlayer; // Починає людина
        this.gameOver = false;
        // Завантажуємо повідомлення в залежності від мови
        this.messages = ResourceBundle.getBundle("messages", locale);
    }

    // Метод для запуску гри
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            // Виведення дошки та запит ходу в залежності від поточного гравця
            System.out.println("Хід гравця: " + currentPlayer.getColor());
            board.printBoard();  // Метод для відображення дошки
            String move = "";

            if (currentPlayer.isHuman()) {
                System.out.print(messages.getString("player_move"));
                move = scanner.nextLine();
                if (isValidMove(move)) {
                    makeMove(move);
                    switchPlayer();
                } else {
                    System.out.println(messages.getString("invalid_move"));
                }
            } else {
                // Логіка для ходу комп'ютера
                System.out.println("Хід комп'ютера...");
                move = getComputerMove();  // Метод для отримання ходу комп'ютера
                makeMove(move);
                switchPlayer();
            }
            checkGameOver();
        }
    }

    // Перевірка чи завершена гра
    private void checkGameOver() {
        if (board.isGameOver()) {
            gameOver = true;
            logger.info(messages.getString("game_over") + " Переможець: " + currentPlayer.getColor());
            System.out.println(messages.getString("game_over"));
        }
    }

    // Переключення між гравцями
    private void switchPlayer() {
        if (currentPlayer == humanPlayer) {
            currentPlayer = computerPlayer;
        } else {
            currentPlayer = humanPlayer;
        }
    }

    // Перевірка валідності ходу
    private boolean isValidMove(String move) {
        // Логіка перевірки ходу
        return true; // Повертається true, якщо хід валідний
    }

    // Виконання ходу
    private void makeMove(String move) {
        // Логіка виконання ходу (наприклад, зміна позиції фігури на дошці)
        System.out.println("Хід виконано: " + move);
        LoggerUtil.logInfo("Хід виконано: " + move);
    }

    // Метод для отримання ходу комп'ютера
    private String getComputerMove() {
        // Логіка для вибору ходу комп'ютером (можна реалізувати просту стратегію)
        return "B6 C5";  // Приклад ходу комп'ютера
    }
}
