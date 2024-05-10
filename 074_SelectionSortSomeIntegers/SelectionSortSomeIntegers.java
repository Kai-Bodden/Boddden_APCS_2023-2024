import java.util.Scanner;
import java.util.ArrayList;
public class SelectionSortSomeIntegers {
    public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    int userInput = 0;
    System.out.println("How man integers do you want?");
    userInput = scan.nextInt();

    ArrayList<Integer> randomInts = randomIntGenerator(userInput);

    System.out.println("Random Unsorted ints:");
    displayNumbers(randomInts);

    selctionSort(randomInts);
    System.out.println("Sorted ints:");
    displayNumbers(randomInts);

    }

    public static ArrayList<Integer> randomIntGenerator(int size){
        ArrayList<Integer> randomInts = new ArrayList<>();
        for(int i =0; i <size; i++){
            randomInts.add((int) (Math.random() * 1000) + 1);
        }
        return randomInts;
    }

    public static void displayNumbers(ArrayList<Integer> integers){
        for(int i = 0; i < integers.size(); i++){
            System.out.println(integers.get(i) + " ");
        }
    }

    public static void selctionSort(ArrayList<Integer> arr){
        int amount = arr.size();//getting array size

        for(int i = 0; i < amount-1; i++){
            //starting sort at the very first value
            int minIndex =i;
            for(int j = i+1; j < amount; j++){
                //compare the first element with the second
                if(arr.get(j) < arr.get(minIndex)){
                    minIndex = j;//if j is smaller, the new min index is j
                }
            }
            //swapping old min with new min
            int num = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));//replacing the minimum element with the elements at index i
            arr.set(i, num);
        }
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/