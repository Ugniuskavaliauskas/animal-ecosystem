package animals;
import organisms.*;
public class Rabbit extends Animal {
    private final int duplicationRate = 10;
    public Rabbit(){
        super(r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1),
                r.nextInt(MIN_MAP_SIZE, MAX_MAP_SIZE+1));
    }
    public void getsEaten(){
        dies();
    }
    @Override
    public String toString(){
        return("X Pozicija: " + super.getXLocation() + "\n" +
                "Y Pozicija: " + super.getYLocation() + "\n" +
                "Ar gyvas?" + this.isAlive());
    }
    public void rabbitDuplicates(){

    }


}
