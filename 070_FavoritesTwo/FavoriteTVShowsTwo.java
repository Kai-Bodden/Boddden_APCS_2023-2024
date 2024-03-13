import java.util.ArrayList;
public class FavoriteTVShowsTwo {
    public static void main(String[] args) {
        ArrayList<String> show = new ArrayList<String>();

        show.add("Breaking Bad");
        show.add("The Office");
        show.add("Stranger Things");

        for(String tvShow : show){
            System.out.println(tvShow);
        }
    }
}
