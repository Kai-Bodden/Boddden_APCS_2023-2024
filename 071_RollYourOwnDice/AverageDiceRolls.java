import java.util.ArrayList;
import java.util.Scanner;
public class AverageDiceRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice diceOne = new Dice(6);
        ArrayList<Integer[]> averageRoll = new ArrayList<>();
        String userInput = "";
        boolean userChoice = false;

        System.out.println("Roll? y or n");
        userInput = scan.nextLine();

        if(userInput == "y"){
            userChoice = true;
            diceOne.roll();
            System.out.println(diceOne.getCurrentValue());
        }
        else{
            System.out.println("OK");
        }





       

    }
}
