import java.util.Scanner;
public class SeventeenMoreOrLess {
    public static void main(String[] args) {
        //getting 3 numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide an integer:");
        int num1 = scan.nextInt();
        System.out.println("Please provide an integer:");
        int num2 = scan.nextInt();
        System.out.println("Please provide an integer:");
        int num3 = scan.nextInt();
        
        //will be true and execute if any of these are true
        if ((num1 - num2 == 17) || (num1 - num2 == -17) || (num2 + num3 == 17) || (num2 + num3 == -17) || (num3 + num1 == 17) || (num3 + num1 == -17))
        {
            System.out.println("One of the numbers is seventeen more or less than the other numbers.");
        }
        //will execute if nothing else is true
        else
        {
            System.out.println("None of the numbers are seventeen more or less than the other numbers.");
        }     
    }
}
