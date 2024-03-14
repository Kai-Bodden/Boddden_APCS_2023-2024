public class Dice {
    private int sides;

    public Dice(int sides){
        this.sides = sides;
    } 

    public void roll(){
        int roll = (int)(1 + (Math.random() * sides));
        return roll;
    }

    public int getSides(){
        return sides;
    }
}
