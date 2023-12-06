import java.util.Scanner;
public class UnethicalRPS {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rock, Paper, or Scissors.");
        String user = scan.nextLine();
        String rock = "Rock";
        String paper = "Paper";
        String scissors ="Scissors";

        if (!user.equalsIgnoreCase(rock) && !user.equalsIgnoreCase(paper) && !user.equalsIgnoreCase(scissors))
        {
            System.out.println("Invalid choice :(");
        }
        else if (user.equalsIgnoreCase(rock))
        {
            System.out.println("The computer chose Paper, you lose."); 
        }
        else if (user.equalsIgnoreCase(paper))
        {
            System.out.println("The computer chose Scissors, you lose.");
        }
        else
        {
            System.out.println("The computer chose Rock, you lose.");
        }
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/