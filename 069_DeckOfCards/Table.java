public class Table{
    public static void main(String[] args){
        //creating my deck and making it available
        Deck deckOne = new Deck();
        Card[] cards = deckOne.getDeck();

        for(Card card : cards){
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        
    }
}