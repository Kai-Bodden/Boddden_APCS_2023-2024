public class FavoriteTVShows{
    public static void main(String[] args) {
        //;oad using initializer list
        String[] favoriteTVShows = {"Breaking Bad", "The Office", "Stranger Things"};

        //print
        System.out.println("My favorite TV Shows:");
        for (String tvShow : favoriteTVShows) {
            System.out.println(tvShow);
        }
    }
}