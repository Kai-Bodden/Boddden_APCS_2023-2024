import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please give a number between 25 and 75");
    int num1 = scan.nextInt();
    System.out.println("Please provide another number between 25 and 75");
    int num2 = scan.nextInt();

    if( (num1 / 10)== (num2 / 10)|| ( num1 / 10 )==( num2 % 10)||  (num1 % 10)== ( num2 /10) ||  ( num1 % 10) == ( num2 % 10))
    {
        System.out.println("There is a common digit of either," + );
    }
    else 
    {
        System.out.println("There is not a common digit");
    }
    }
}