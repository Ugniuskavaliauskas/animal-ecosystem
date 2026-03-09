package organisms;
import exceptions.*;
import interfaces.Liveable;

import java.util.*;
public abstract class Animal implements Liveable {
    protected static final Random r = new Random();
    protected static final int MIN_MAP_SIZE = 0;
    protected static final int MAX_MAP_SIZE = 100;
    private boolean alive = true;
    private int x,y; // pozicija
    private static int animalCount = 0;


    public Animal(){
        this(
                (r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1)),
                (r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1))
        );
    }
    public Animal(int x, int y){
        this.x = x;
        this.y = y;
        animalCount++;
    }

    public void move(int dx, int dy) throws InvalidMovementException {
        if((x+dx)>=MAX_MAP_SIZE || (x+dx) <= MIN_MAP_SIZE)throw new InvalidMovementException("Nepavyko judeti uz zemelapio ribu", (getXLocation()+dx), (getYLocation()+dy));
        x += dx;
        if((y+dy)>=MAX_MAP_SIZE || (y+dy) <= MIN_MAP_SIZE)throw new InvalidMovementException("Nepavyko judeti uz zemelapio ribu", (getXLocation()+dx), (getYLocation()+dy));
        y += dy;
    }
    @Override
    public void move() throws InvalidMovementException {
        move(0, 0);
    }
    public final void setXLocation(int x){
        this.x = x;
    }
    public final int getXLocation(){
        return this.x;
    }
    public final void setYLocation(int y){
        this.y = y;
    }
    public final int getYLocation(){
        return this.y;
    }

    public static int getAnimalCount(){
        return animalCount;
    }
    public void println(){
        System.out.println("X pozicija: " + x);
        System.out.println("Y pozicija: " + y);
    }
    @Override
    public final boolean isAlive() {
        return this.alive;
    }
    public final void dies(){
        this.alive = false;
    }
}
