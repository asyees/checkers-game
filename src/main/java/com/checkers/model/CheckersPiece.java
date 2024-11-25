package com.checkers.model;

public class CheckersPiece {
    private boolean isKing;
    private String color; // "white" або "black"

    public CheckersPiece(String color) {
        this.color = color;
        this.isKing = false;
    }

    public void makeKing() {
        this.isKing = true;
    }
}

