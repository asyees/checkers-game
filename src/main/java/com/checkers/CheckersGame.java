package com.checkers;

import com.checkers.controller.GameController;
import com.checkers.model.Player;

import java.util.Locale;

public class CheckersGame {

    public static void main(String[] args) {
        // Приветственное сообщение
        System.out.println("Welcome to the Checkers Game!");
        System.out.println("Initializing the game...");

        // Установка локализации (английский язык по умолчанию)
        Locale locale = new Locale("en", "US");

        // Создание игроков
        Player humanPlayer = new Player("Human", "white", true);  // Игрок-человек
        Player computerPlayer = new Player("Computer", "black", false); // Игрок-компьютер

        // Создание контроллера игры
        GameController gameController = new GameController(humanPlayer, computerPlayer, locale);

        // Запуск игры
        gameController.startGame();

        // Завершение программы
        System.out.println("Thank you for playing Checkers!");
    }
}
