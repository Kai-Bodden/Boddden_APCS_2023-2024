import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please give a number between 25 and 75");
    int num1 = scan.nextInt();
    System.out.println("Please provide another number between 25 and 75");
    int num2 = scan.nextInt();

    if( 25<=num1 && 75>=num1 && 25<=num2 && 75>=num2 )
    {
        //set each varible to then compare, using first1num and second1num as the possible common value
       int first1num = num1 % 10;
       int second1num = (num1 - first1num) / 10;
       int first2num = num2 % 10;
       int second2num = (num2 - first2num) / 10;
       if ( second1num == second2num || second1num == first2num)
       {
        System.out.println("the first and second integers have a matching value of "+ second1num);
       }
       else if ( first1num == second1num || first1num == first2num)
       {
        System.out.println("the first and second integers have a matching value of " + first1num);
       }
       else
       {
        System.out.println("No matching values");
       }
    }
    else 
    {
        System.out.println("Invalid input");
    }
    }
}
//modulo and if statements to evaluate every possible common integer, else for anything else

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/