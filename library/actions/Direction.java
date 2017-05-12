package library.actions;

/**
 * Created by mirco on 5/10/2017.
 */
public enum Direction {

    NORTH("To the north", 0 , 1 ) ,

    EAST("To the east", 1 , 0 ) ,

    SOUTH("To the south" , 0 , -1 ) ,

    WEST("To the west" , -1 ,0 );

    private final int dX;
    private final int dY;

    private final String description;

    Direction(String description,int dX,int dY){
        this.description = description;
        this.dX = dX;
        this.dY = dY;
    }
    public int getdX() {
        return dX;
    }

    public int getdY() {
        return dY;
    }

    public String getDescription() {
        return description;
    }

}