public class FavoriteMovies{
    public static void main(String[]args){
        //creating array, setting size of array
        String[] favoriteMovies = new String[3];
        favoriteMovies[0] = "Boyz n the Hood";
        favoriteMovies[1] = "Pirates of the Caribbean";
        favoriteMovies[2] = "Joker";

        //print
        System.out.println("My favorite Movies: ");
        for (String movie : favoriteMovies){
            System.out.println(movie);
        }
    }
}