package Main;

public class Main {


    

    public static void main(String[] args) {
        Piece piece = new Piece(Color.BLACK, 3);
        Piece piece2 = new Piece(Color.WHITE, 2);
        Edge edge = new Edge(2);
        System.out.println(edge.isEdgeOccupied(piece));
        System.out.println(piece.getPieceColor());
        System.out.println(piece2.getPieceColor());
    }
    
}
