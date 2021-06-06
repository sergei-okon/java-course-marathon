package day17;

public enum ChessPiece {
    KING_WHITE(100, '\u2654'), QUEEN_WHITE(9, '\u2655'), CASTLE_WHITE(5, '\u2656'),
    BISHOP_WHITE(3.5, '\u2657'), KNIGHT_WHITE(3, '\u2658'), PAWN_WHITE(1, '\u2659'),

    KING_BLACK(100, '\u265A'), QUEEN_BLACK(9, '\u265B'), CASTLE_BLACK(5, '\u265C'),
    BISHOP_BLACK(3.5, '\u265D'), KNIGHT_BLACK(3, '\u265E'), PAWN_BLACK(1, '\u265F'),
    EMPTY(-1, '\u005F');

    private double figureValue;
    private char figureUnicod;

    ChessPiece(double figureValue, char figureUnicod) {
        this.figureValue = figureValue;
        this.figureUnicod = figureUnicod;
    }

    public double getFigureValue() {
        return figureValue;
    }

    public char getFigureUnicod() {
        return figureUnicod;
    }

    @Override
    public String toString() {
        return "" +
                figureUnicod +
                ' ';
    }
}
