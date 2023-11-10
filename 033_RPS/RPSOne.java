import java.util.Scanner;
public class RPSOne {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) ((Math.random()*3)+1);
        System.out.println("Rock, Paper, or Scissors?");
        String user = scan.nextLine();
        
        if (num == 1)
        {
            String comp = "rock";
        }
        else if (num == 2)
        {
            String comp = "paper";
        }
        else if (num == 3)
        {
            String comp = "scissors";
        }
            if (comp = user)
    }
}
