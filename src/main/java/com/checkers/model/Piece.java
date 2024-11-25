package com.checkers.model;

public class Piece {

    private String color; // Колір фішки (чорний або білий)
    private boolean isKing; // Ознака, чи є фішка дамкою

    // Конструктор для ініціалізації фішки
    public Piece(String color) {
        this.color = color;
        this.isKing = false; // Спочатку фішка не є дамкою
    }

    // Метод для отримання кольору фішки
    public String getColor() {
        return color;
    }

    // Метод для отримання статусу дамки
    public boolean isKing() {
        return isKing;
    }

    // Метод для перетворення фішки на дамку
    public void promoteToKing() {
        this.isKing = true;
    }

    // Метод для скидання статусу дамки
    public void demoteFromKing() {
        this.isKing = false;
    }
}
