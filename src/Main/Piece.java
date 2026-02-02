package Main;

public class Piece {
    private final Color pieceColor;
    private final int piecePosition;
    

    public Piece(Color pieceColor, int piecePosition){
        this.pieceColor = pieceColor;
        this.piecePosition = piecePosition;
    }



    public Color getPieceColor() {
        return pieceColor;
    }

    public int getPiecePosition() {
        return piecePosition;
    }

    
}
