package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Piece {
    private final Color pieceColor;
    private final int piecePosition;
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-3,-1,1,3};

    public Piece(Color pieceColor, int piecePosition){
        this.pieceColor = pieceColor;
        this.piecePosition = piecePosition;
    }

    public Collection<Move> calculateLegalMoves(Board board){
        List<Move> legalMoves = new ArrayList<>();
        for (int candidateCoordinate : CANDIDATE_MOVE_VECTOR_COORDINATES) {
            int candidateDestinationCoordinate = candidateCoordinate + this.piecePosition;
            if (BoardUtils.isValidCoordinate(candidateDestinationCoordinate)) {
                if (isFirstColumExclusion(this.piecePosition,candidateCoordinate)) {
                    continue;
                }
                Edge edge = board.getEdge(candidateDestinationCoordinate);
                if (!edge.isEdgeOccupied()) {
                    legalMoves.add(new Move(this.piecePosition,candidateDestinationCoordinate,this));
                }
            }
            
        }
        return legalMoves;
    }

    private boolean isFirstColumExclusion(int piecePosition, int candidateCoordinate) {
        return (piecePosition == 0 || 
                piecePosition == 3 || 
                piecePosition == 6) && candidateCoordinate == -1;
    }


    public Color getPieceColor() {
        return pieceColor;
    }

    public int getPiecePosition() {
        return piecePosition;
    }

    
}
