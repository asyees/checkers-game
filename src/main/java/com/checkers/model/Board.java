package com.checkers.model;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    // Конструктор за замовчуванням
    public Board() {
        this(8, 8); // Розмір дошки 8x8
    }

    // Основний конструктор
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
        initializeBoard();
    }

    // Ініціалізація дошки початковими фігурами
    private void initializeBoard() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if ((row < 3 || row > 4) && (row + col) % 2 != 0) {
                    pieces[row][col] = new Piece((row < 3) ? "Black" : "White");
                }
            }
        }
    }

    // Метод для перевірки, чи завершена гра
    public boolean isGameOver() {
        boolean hasWhitePieces = false;
        boolean hasBlackPieces = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                Piece piece = pieces[row][col];
                if (piece != null) {
                    if (piece.getColor().equalsIgnoreCase("White")) {
                        hasWhitePieces = true;
                    } else if (piece.getColor().equalsIgnoreCase("Black")) {
                        hasBlackPieces = true;
                    }
                }
                if (hasWhitePieces && hasBlackPieces) {
                    return false; // Якщо обидва типи фігур присутні, гра не завершена
                }
            }
        }
        return true; // Гра завершена, якщо залишився лише один тип фігур
    }

    // Метод для друку дошки
    public void printBoard() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                Piece piece = pieces[row][col];
                if (piece == null) {
                    System.out.print("[ ] "); // Порожня клітинка
                } else {
                    System.out.print("[" + piece.getColor().charAt(0) + "] "); // Фішка
                }
            }
            System.out.println();
        }
    }

    // Метод для отримання кількості рядків
    public int getRows() {
        return rows;
    }

    // Метод для отримання кількості колонок
    public int getColumns() {
        return columns;
    }

    // Метод для отримання фігури на певній позиції
    public Piece getPieceAt(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < columns) {
            return pieces[row][col];
        }
        return null; // Якщо координати виходять за межі
    }
}
