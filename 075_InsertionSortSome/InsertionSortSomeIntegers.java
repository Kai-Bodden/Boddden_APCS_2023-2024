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
        displayNumbers(randomInts);

        int[] randomIntsArray = randomInts.stream().mapToInt(Integer::intValue).toArray();
        int[] sortedArray = insertionSort(randomIntsArray);

        System.out.println("Sorted ints:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> randomIntGenerator(int size) {
        ArrayList<Integer> randomInts = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomInts.add((int) (Math.random() * 1000) + 1);
        }
        return randomInts;
    }

    public static void displayNumbers(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + " ");
        }
        System.out.println();
    }

    public static int[] insertionSort(int[] arr) {//declaring method, an array being the input with an output of another int array
        for (int i = 1; i < arr.length; i++) {//since insertion sorts use the numbers to its left to compare, we start at index 1
            int temp = arr[i];//current compared value, temporary spot for our value
            int possibleIndex = i;//index of current compared value

            while (possibleIndex > 0 && temp < arr[possibleIndex - 1]) {//essentially will run until our temporary number is properly sorted relative to its surroundings 
                arr[possibleIndex] = arr[possibleIndex - 1];//moves the left value to make space for the current compared value
                possibleIndex--;//continues moving left
            }
            arr[possibleIndex] = temp;//if the while loop ends, the number is sorted 
        }
        return arr;//after the for loop completes, arr is returned
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/