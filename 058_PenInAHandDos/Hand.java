public class Hand {
    public static void main(String[] args) {
        Pen basic = new Pen();
        Pen one = new Pen("red" + "black" + "clickey" + 45);
        Pen two = new Pen("orange" + "green" + "cap" + 12);
        Pen three = new Pen("Purple" + "grey" + "clickey" + 99);

        one.inkRemaining();
        one.capOff();
    }
}
