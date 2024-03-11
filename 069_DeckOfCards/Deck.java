public class Deck{
    //variables
    private Card[] cards;
    private int currentIndex;

    //deck constructor
    public Deck(){
        cards = new Card[52];
        currentIndex = 0;
        makeDeck();
    }

    //whats makes the deck
    private void makeDeck(){
        String[] suits = {"Spade", "Club", "Heart", "Diamond"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int index = 0;
        /*
        for loop where each card with be created, given a value, then a suit, creating all 52 cards, 
        which is how much space the array has
         */
        for(String suit : suits){
            for(String value : values){
                cards[index++] = new Card(suit, value);
            }
        }
    }

    public Card[] getDeck(){
        return cards;
    }
}