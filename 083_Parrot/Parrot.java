import java.util.Scanner;

public class Parrot{
    static Scanner scan = new Scanner(System.in);

    //calling phraseRepeater
    public static void main(String[] args){
        System.out.println("Greet the parrot please: ");
        phraseRepeater();
}

    public static void phraseRepeater() {
        String userInput = scan.nextLine();

        //user can exit by typing exit, endling the loop
        if(userInput.equalsIgnoreCase("exit")){
            System.out.println("No Mas!");
            return;
        }
        //if the user doesn't want to exit, phraseRepeater is called again, starting the process over
        else{
            System.out.println("Squak.." + userInput);
            phraseRepeater();
        }
    }
}