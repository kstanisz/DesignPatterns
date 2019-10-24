package flyweight;

import flyweight.piece.ChessPiece;
import flyweight.piece.ChessPieceFactory;

public class Main {

    public static void main(String[] args) {
        // Flyweight patter can save memory - less objects.
        for (int i = 0; i < 100; i++) {
            ChessPiece blackQueen = ChessPieceFactory.createBlackQueen();
            blackQueen.setPosition("E7");

            ChessPiece whiteQueen = ChessPieceFactory.createWhiteQueen();
            whiteQueen.setPosition("D5");
        }
    }
}
