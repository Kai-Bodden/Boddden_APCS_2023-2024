import java.util.ArrayList;
public class FavoriteMoviesTwo {
    public static void main(String[] args) {
        ArrayList<String> mov = new ArrayList<String>();

        mov.add("Boyz n the Hood");
        mov.add("Pirates of the Caribbean");
        mov.add("Joker");

        for(String movie : mov){
            System.out.println(movie);
        }
    }
}
