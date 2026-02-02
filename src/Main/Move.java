package Main;
public class Move {
    int pieceDestination;
    Piece piece;
    Edge edge;
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = {-3,-1,1,3};

    Move(Piece piece, Edge edge){
        this.edge = edge;
        this.piece = piece;
    }
    
    public static void movePieceToDestination(){
        
    }




    private boolean isFirstColumExclusion(int piecePosition, int candidateCoordinate) {
        return (piecePosition == 0 || 
                piecePosition == 3 || 
                piecePosition == 6) && candidateCoordinate == -1;
    }




}
