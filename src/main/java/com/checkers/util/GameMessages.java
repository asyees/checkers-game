package com.checkers.util;

import java.util.ResourceBundle;
import java.util.Locale;

public class GameMessages {
    private static ResourceBundle messages;

    // Завантажуємо ресурси на основі локалі
    public static void initialize(Locale locale) {
        messages = ResourceBundle.getBundle("messages", locale);
    }

    // Отримуємо повідомлення по ключу
    public static String getMessage(String key) {
        return messages.getString(key);
    }

    // Отримуємо повідомлення по ключу з параметрами
    public static String getMessage(String key, Object... params) {
        String message = messages.getString(key);
        return String.format(message, params);  // Форматуємо повідомлення з параметрами
    }
}
