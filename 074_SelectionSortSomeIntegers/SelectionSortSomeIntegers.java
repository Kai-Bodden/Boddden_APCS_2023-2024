import java.util.Scanner;
import java.util.ArrayList;
public class SelectionSortSomeIntegers {
    public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    int userInput = 0;
    System.out.println("How man integers do you want?");
    userInput = scan.nextInt();



    }

    public static ArrayList<Integer> randomIntGenerator(int size){
        ArrayList<Integer> randomInts = new ArrayList<>();
        for(int i =0; i <size; i++){
            randomInts.add((int) (Math.random() * 1000) + 1);
        }
        return randomInts;
    }



}
