package Main;


public class Edge {
    final int edgeCoordinate;


    public Edge(int edgeCoordinate){
        this.edgeCoordinate = edgeCoordinate;
    }

    public int getEdgeCoordinate() {
        return edgeCoordinate;
    }

    public boolean isEdgeOccupied(Piece piece){
        return this.edgeCoordinate == piece.getPiecePosition();
    }

    
 
}





    


    




    
