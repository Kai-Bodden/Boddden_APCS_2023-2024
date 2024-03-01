public class FavoriteNumbers{
    public static void main(String[] args){
        //loading with initializer list
        int[] favoriteNumbers = {7, 68, 3};

        //print
        System.out.println("My favorite numbers: ");
        for (int number : favoriteNumbers){
            System.out.println(number);
        }
    }
}