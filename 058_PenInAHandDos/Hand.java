public class Hand {
    public static void main(String[] args) {
        //creating my pens
        Pen basic = new Pen();
        Pen one = new Pen("red", "black", "clickey", 45);
        Pen two = new Pen("orange", "green", "cap", 12);
        Pen three = new Pen("Purple", "grey", "clickey", 99);

        //describing pens
        basic.inkRemaining();
        basic.capOff();
        basic.clickedOut();
        basic.wordsToWrite("Copped the trackhawk");

        one.inkRemaining();
        one.capOff();
        one.clickedOut();
        one.wordsToWrite("I love lebron");

        two.inkRemaining();
        two.capOff();
        two.clickedOut();
        two.wordsToWrite("Versace belt");

        three.inkRemaining();
        three.capOff();
        three.clickedOut();
        three.wordsToWrite("Apple watch");
    }
}
