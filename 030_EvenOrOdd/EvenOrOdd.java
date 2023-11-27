import java.util.Scanner;
public class EvenOrOdd {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number please: ");
        int num = scan.nextInt();
        int evenodd = num%2;
        if (evenodd == 0)
        {
            System.out.println("Even");
        }
        else if (evenodd != 0) 
        {
            System.out.println("Odd");
        }
    //first time using if. If anything else than desired, else if can help
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/