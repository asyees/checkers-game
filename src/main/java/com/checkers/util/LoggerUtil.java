package com.checkers.util;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class LoggerUtil {
    // Створення статичного логера для використання в інших класах
    private static final Logger logger = Logger.getLogger(LoggerUtil.class.getName());

    // Статичний блок ініціалізації для налаштування логера
    static {
        try {
            // Консольний обробник для виведення логів в консоль
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            logger.addHandler(consoleHandler);

            // Файловий обробник для запису логів у файл
            FileHandler fileHandler = new FileHandler("game.log", true);  // true — для дозвіл на додавання до існуючого файлу
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);

            // Налаштовуємо рівень логування
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            // Якщо виникла помилка при налаштуванні логера
            logger.log(Level.SEVERE, "Не вдалося налаштувати файловий логер", e);
        }
    }

    // Метод для логування повідомлень інформаційного рівня
    public static void logInfo(String message) {
        logger.info(message);
    }

    // Метод для логування попереджень
    public static void logWarning(String message) {
        logger.warning(message);
    }

    // Метод для логування помилок
    public static void logError(String message, Throwable throwable) {
        logger.log(Level.SEVERE, message, throwable);
    }

    // Метод для логування відладкових повідомлень
    public static void logDebug(String message) {
        logger.fine(message);
    }
}
