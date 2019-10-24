package flyweight.piece;

import flyweight.Color;

public abstract class ChessPiece {
    // Flyweight pattern: static enum - one instance for common fields
    private final Color color;

    private String position;

    ChessPiece(Color color, String position) {
        this.color = color;
        this.position = position;
    }


    public Color getColor() {
        return color;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}