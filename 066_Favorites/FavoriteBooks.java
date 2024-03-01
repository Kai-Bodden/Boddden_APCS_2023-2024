public class FavoriteBooks {
    public static void main(String[] args) {
        //load with initializer list
        String[] favoriteBooks = {"Diary of a Wimpy Kid", "1984", "Percy Jackson"};

        //print
        System.out.println("Favorite Books:");
        for (String book : favoriteBooks) {
            System.out.println(book);
        }
    }
}