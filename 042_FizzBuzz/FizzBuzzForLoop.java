import java.util.Scanner;
public class FizzBuzzForLoop {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me an integer greater than or equal to 1 you would like me to count to.");
        int userCount = scan.nextInt();

        for (int count = 1; count <= userCount; count ++){
            if (count % 3 == 0 && count % 5 == 0){
                //both true or it will skip to the next
                System.out.println("Fizzbuzz");
            }
            else if (count % 3 == 0){
                System.out.println("Fizz");
            }
            else if (count % 5 == 0){
                System.out.println("Buzz");
            }
            //display count if all else is false
            else{
                System.out.println(count);
            }
        }   
    }
}
//may add it is a little more compact than the while loop code, optimal for a known end