package com.checkers.view;

import com.checkers.model.Board;
import com.checkers.model.Piece;

public class BoardView {

    private Board board;

    public BoardView(Board board) {
        this.board = board;
    }

    // Метод для відображення дошки гри
    public void displayBoard() {
        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getColumns(); col++) {
                Piece piece = board.getPieceAt(row, col);
                if (piece == null) {
                    System.out.print("[ ] ");  // Порожня клітинка
                } else {
                    System.out.print("[" + piece.getColor().charAt(0) + "] "); // Фішка
                }
            }
            System.out.println();
        }
    }
}
