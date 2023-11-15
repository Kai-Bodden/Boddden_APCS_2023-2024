import java.util.Scanner;
public class RPSOne {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) ((Math.random()*3)+1);
        System.out.println("Rock, Paper, or Scissors?");
        String user = scan.nextLine();
        String comp = "";
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
        if (!user.equalsIgnoreCase("rock") && !user.equalsIgnoreCase("paper") && !user.equalsIgnoreCase("scissors"))
        {
            System.out.println("Invalid choice.");
        }
        else if (user.equalsIgnoreCase(comp))
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("tie :(");
        }
        else if ((user.equalsIgnoreCase("rock") && comp.equals("scissors")) || (user.equalsIgnoreCase("paper") && comp.equals("rock")) || (user.equalsIgnoreCase("scissors") && comp.equals("paper")))
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("You won!");
        }
        else
        {
            System.out.println("The computer chose:" + comp);
            System.out.println("You lost:(");
        }   
	}
}
