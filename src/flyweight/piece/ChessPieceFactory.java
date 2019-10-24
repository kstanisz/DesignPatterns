package flyweight.piece;

import flyweight.Color;

public class ChessPieceFactory {

    public static ChessPiece createBlackQueen() {
        return new Queen(Color.BLACK);
    }

    public static ChessPiece createWhiteQueen() {
        return new Queen(Color.WHITE);
    }
}
