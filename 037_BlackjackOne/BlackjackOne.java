import java.util.Scanner;
public class BlackjackOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cardOne = (int)(1 + Math.random() * 13);
        int cardTwo = (int)(1 + Math.random() * 13);
        int cardThree = (int)(1 + Math.random() * 13);
        cardOne = 10;
        if (cardOne == 1)
        {
            System.out.println("You have an ace ");
        }
        else if (cardOne == 2)
        {
            System.out.println("You have a two ");
        }
        else if (cardOne == 3)
        {
            System.out.println("You have a three ");
        }
        else if (cardOne == 4)
        {
            System.out.println("You have a four ");
        }
        else if (cardOne == 5)
        {
            System.out.println("You have a five ");
        }
        else if (cardOne == 6)
        {
            System.out.println("You have a six ");
        }
        else if (cardOne == 7)
        {
            System.out.println("You have a seven ");
        }
        else if (cardOne == 8)
        {
            System.out.println("You have an eight ");
        }
        else if (cardOne == 9)
        {
            System.out.println("You have a nine ");
        }
        else if (cardOne == 10)
        {
            System.out.println("You have a ten ");
        }
        else if (cardOne == 11)
        {
            System.out.println("You have a jack ");
            cardOne = 10;
        }
        else if (cardOne == 12)
        {
            System.out.println("You have a queen ");
            cardOne = 10;
        }
        else if (cardOne == 13)
        {
            System.out.println("You have a king ");
            cardOne = 10;
        }
         if (cardTwo == 1)
        {
            System.out.println("You have an ace ");
        }
        else if (cardTwo == 2)
        {
            System.out.println("You have a two ");
        }
        else if (cardTwo == 3)
        {
            System.out.println("You have a three ");
        }
        else if (cardTwo == 4)
        {
            System.out.println("You have a four ");
        }
        else if (cardTwo == 5)
        {
            System.out.println("You have a five ");
        }
        else if (cardTwo == 6)
        {
            System.out.println("You have a six ");
        }
        else if (cardTwo == 7)
        {
            System.out.println("You have a seven ");
        }
        else if (cardTwo == 8)
        {
            System.out.println("You have an eight ");
        }
        else if (cardTwo == 9)
        {
            System.out.println("You have a nine ");
        }
        else if (cardTwo == 10)
        {
            System.out.println("You have a ten ");
        }
        else if (cardTwo == 11)
        {
            System.out.println("You have a jack ");
            cardTwo = 10;
        }
        else if (cardTwo == 12)
        {
            System.out.println("You have a queen ");
            cardTwo = 10;
        }
        else if (cardTwo == 13)
        {
            System.out.println("You have a king ");
            cardTwo = 10;
        }
        System.out.println("You have a total card value of " + (cardOne + cardTwo));
        System.out.println("Would you like to hit or stand?");
        int total = cardOne + cardTwo;
        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("hit"))
        {
            if (cardThree == 1)
            {
            System.out.println("You have an ace ");
            }
            else if (cardThree == 2)
            {
            System.out.println("You have a two ");
            }
            else if (cardThree == 3)
            {
            System.out.println("You have a three ");
            }
            else if (cardThree == 4)
            {
            System.out.println("You have a four ");
            }
            else if (cardThree == 5)
            {
            System.out.println("You have a five ");
            }
            else if (cardThree == 6)
            {
            System.out.println("You have a six ");
            }
            else if (cardThree == 7)
            {
            System.out.println("You have a seven ");
            }
            else if (cardThree == 8)
            {
            System.out.println("You have an eight ");
            }
            else if (cardThree == 9)
            {
            System.out.println("You have a nine ");
            }
            else if (cardThree == 10)
            {
            System.out.println("You have a ten ");
            }
            else if (cardThree == 11)
            {
            System.out.println("You have a jack ");
            cardThree = 10;
            }
            else if (cardThree == 12)
            {
            System.out.println("You have a queen ");
            cardThree = 10;
            }
            else if (cardThree == 13)
            {
            System.out.println("You have a king ");
            cardThree = 10;
            }
        }
        else
        {
            System.out.println("You chose to stand. You final total is " + (cardOne + cardTwo));
        }
        if (cardOne + cardTwo + cardThree <= 21)
        {
            System.out.println("You win with a total of " + (cardOne + cardTwo + cardThree));
        }
        else
        {
            System.out.println("You lose");
        }  
    }
}