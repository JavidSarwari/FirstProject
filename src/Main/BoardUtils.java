package Main;

public class BoardUtils {
    public static final int EDGE_NUM = 9; 

    public BoardUtils(){
        throw new RuntimeException("You cannot use me!");
    }



    public static boolean isValidCoordinate(int edgeCoordinate){
        return 0 < edgeCoordinate && edgeCoordinate < 9;
    }
}
