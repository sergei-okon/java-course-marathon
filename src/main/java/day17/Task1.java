package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] pawWhite = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.CASTLE_BLACK, ChessPiece.CASTLE_BLACK, ChessPiece.CASTLE_BLACK, ChessPiece.CASTLE_BLACK};

        for (ChessPiece chessPiece : pawWhite) {
            System.out.print(chessPiece.getFigureUnicod() + " ");
        }
    }
}
