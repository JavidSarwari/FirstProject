package Player;

import java.util.Collection;

import Main.Board;
import Main.Color;
import Main.Move;
import Main.Piece;

public abstract class Player {

    protected Collection<Move> legalMoves;
    protected Board board;


    Player(){

    }

    public abstract Collection<Piece> getActivePieces();
    public abstract Color getColor();
    public abstract Player getOpponent();
    
}
