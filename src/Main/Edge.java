package Main;

import java.util.HashMap;
import java.util.Map;

public abstract class Edge {
    protected final int edgeCoordinate;
    private static final Map<Integer, EmptyEdge> CREAT_ALL_POSSIBLE_Edge = creatEmptyEdge();



    private static Map<Integer, EmptyEdge> creatEmptyEdge() {
        Map<Integer,EmptyEdge>  emptyEdge = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            emptyEdge.put(i, new EmptyEdge(i));
            
        }
        return emptyEdge;
    }


    public static final class EmptyEdge extends Edge{


    }


    public static final class OccupiedEdge extends Edge{

    }





    


    




    
}
