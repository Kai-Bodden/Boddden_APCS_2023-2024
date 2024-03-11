public class Card{
    //variables
    private String suit;
    private String value;

    //constructor
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    //getters
    public String getSuit(){
        return suit;
    }

    public String getValue(){
        return value;
    }

}