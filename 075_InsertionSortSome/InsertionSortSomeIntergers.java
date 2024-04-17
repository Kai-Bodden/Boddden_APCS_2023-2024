import java.util.Scanner;
import java.util.ArrayList;

public class InsertionSortSomeIntegers {
   public static void main(String[] args) {
       InsertionSortSomeIntegers insert = new InsertionSortSomeIntegers();
       Scanner scan = new Scanner(System.in);

       int userInput = 0;
       System.out.println("How many integers do you want?");
       userInput = scan.nextInt();

       ArrayList<Integer> randomInts = randomIntGenerator(userInput);

       System.out.println("Random Unsorted ints:");
       insert.displayNumbers(randomInts);

   
   }

   public static ArrayList<Integer> randomIntGenerator(int size){
       ArrayList<Integer> randomInts = new ArrayList<>();
       for(int i = 0; i < size; i++){
           randomInts.add((int) (Math.random() * 1000) + 1);
       }
       return randomInts;
   }

   public static void displayNumbers(ArrayList<Integer> integers){
       for(int i = 0; i < integers.size(); i++){
           System.out.print(integers.get(i) + " ");
       }
       System.out.println();
   }


}




