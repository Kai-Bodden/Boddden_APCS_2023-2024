import java.util.ArrayList;
import java.util.Scanner;

public class AverageDiceRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice diceOne = new Dice(6);
        ArrayList<Integer> averageRoll = new ArrayList<>();
        String userInput = "y";

       while (userInput.equals("y")){
        System.out.println("Roll? y or n?");
        userInput = scan.nextLine();
    
        if(userInput.equals("y")){
            diceOne.roll();
            int rollValue = diceOne.getCurrentValue();
            averageRoll.add(rollValue);
            System.out.println("Dice Roll of: " + rollValue);
        }
        else{
            System.out.println("OK");
        }
    }

        //average
        double total = 0;
        for(int roll : averageRoll){
            total += roll;
        }
        if(!averageRoll.isEmpty()){
            double average = total/averageRoll.size();
            System.out.println("Average roll of: " + average);    
        }
        else{
            System.out.println("no rolls");
        }

    }
}


/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/