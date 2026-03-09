package exceptions;

public class InvalidMovementException extends EcosystemException {
    private final int x,y;
    public InvalidMovementException(String message, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
