public class Dice {
    private int sides;
    private int currentValue;

    public Dice(int sides){
        this.sides = sides;
        roll();
    } 

    //roll is not a variable, but a way to set a value for current value
    public void roll() {
        currentValue = (int)(1 + (Math.random() * sides));
    }

    public int getCurrentValue(){
        return currentValue;
    }

    public int getSides(){
        return sides;
    }
}
