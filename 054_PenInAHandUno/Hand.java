public class Hand {
    public static void main(String[] args) {
        //created a pen and called upon my objects 
        Pen penOne = new Pen();
        penOne.inkRemaining();
        penOne.capOff();
        penOne.clickedOut();
        //object requires a string when called 
        penOne.wordsToWrite("Lebron");
    }
}
