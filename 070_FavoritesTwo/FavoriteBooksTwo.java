import java.util.ArrayList;
public class FavoriteBooksTwo {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<String>();

        book.add("1984");
        book.add("Percy Jackson");
        book.add("Diary of a Wimpy Kid");

        for(String books : book){
            System.out.println(books);
        }
    }
}
