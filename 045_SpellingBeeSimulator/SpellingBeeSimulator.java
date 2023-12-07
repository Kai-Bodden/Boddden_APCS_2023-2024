import java.util.Scanner;
public class SpellingBeeSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a word to spell:");
        String word = scan.nextLine();

        System.out.println(word + ". " + word + " is spelled ");
        //when word is given, will print letters until equal
        for(int x = 0; x < word.length(); x++){
            System.out.print(word.substring(x, x +1));
            //this will run after the print statement, but before it runs again 
            if(x < word.length()-1){
                System.out.print("-");
            }
            else{
                System.out.println(".");
            }
        }
    }
}
