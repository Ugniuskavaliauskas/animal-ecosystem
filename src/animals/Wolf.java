package animals;
import exceptions.*;
import interfaces.Liveable;
import organisms.*;
public class Wolf extends Animal{
    private final int MAX_HUNGER = 100;
    private int hunger = Animal.r.nextInt(0,26);
    public Wolf(){
        super(r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1),
                r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1));
    }
    @Override
    public void move(int dx, int dy) throws InvalidMovementException{
        super.move(dx,dy);
        hunger+=5;
        if(hunger >= MAX_HUNGER){
            dies();
        }
    }
    public void huntsRabbit(Rabbit rabbit){
        rabbit.getsEaten();
        setHunger(0);
    }
    public int getHunger(){
        return hunger;
    }
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    @Override
    public String toString(){
        return("X Pozicija: " + getXLocation() + "\n" +
                "Y Pozicija: " + getYLocation() + "\n" +
                "Alkis: " + hunger +
                "Ar gyvas?" + isAlive());
    }
}
