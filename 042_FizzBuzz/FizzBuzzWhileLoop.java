import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me an integer greater than or equal to 1 you would like me to count to.");
        int userCount = scan.nextInt();
        int count = 1;

        while (count <= userCount) {
            //will run until my count is equal to the user input
            if (count % 3 == 0 && count % 5 == 0){
                //both true or it will skip to the next
                System.out.println("Fizzbuzz");
                count++;
            }
            else if (count % 3 == 0){
                System.out.println("Fizz");
                count++;
            }
            else if (count % 5 == 0){
                System.out.println("Buzz");
                count++;
            }
            //display count if all else is false
            else{
                System.out.println(count);
                count++;
            }
        }       
    }
}
