import java.util.Scanner;
public class RPSOne {
    public static void main (String[]args) {
        //variables
        Scanner scan = new Scanner(System.in);
        int num = (int) ((Math.random()*3)+1);
        System.out.println("Rock, Paper, or Scissors?");
        String user = scan.nextLine();
        String comp = "";
        //setting random number to a rps value
        if (num == 1)
        {
            comp = "rock";
        }
            else if (num == 2) 
            {
            comp = "paper";
            }
                else
                {
                comp = "scissors";
                }
                //if any of these are true, it skips to else if
        if (!user.equalsIgnoreCase("rock") && !user.equalsIgnoreCase("paper") && !user.equalsIgnoreCase("scissors"))
        {
            System.out.println("Invalid choice.");
        }
        //if user is same
        else if (user.equalsIgnoreCase(comp))
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("tie :(");
        }
        //if user wins
        else if ((user.equalsIgnoreCase("rock") && comp.equals("scissors")) || (user.equalsIgnoreCase("paper") && comp.equals("rock")) || (user.equalsIgnoreCase("scissors") && comp.equals("paper")))
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("You won!");
        }
        //if anything else
        else
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("You lost:(");
        }   
	}
}
