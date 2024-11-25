package com.checkers.model;

public class Player {
    private String name;
    private String color;
    private boolean isHuman;

    // Основний конструктор
    public Player(String name, String color, boolean isHuman) {
        this.name = name;
        this.color = color;
        this.isHuman = isHuman;
    }

    // Конструктор з одним параметром (колір)
    public Player(String color) {
        this.name = color.equals("white") ? "Human" : "Computer";
        this.color = color;
        this.isHuman = color.equals("white"); // "white" для людини
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isHuman() {
        return isHuman;
    }
}
