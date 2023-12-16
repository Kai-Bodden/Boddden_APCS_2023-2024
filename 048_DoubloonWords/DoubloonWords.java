/*import java.util.Scanner;
public class DoubloonWords{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide a word:");
        String user = scan.nextLine();
        String trim = user.trim();
        String word = trim.toLowerCase();

        boolean Doubloon = false;

        for(int i=0; i<word.length(); i++){
        int count = 0;
                for(int k=i+1; k<word.length(); k++){
                    if(word.substring(i, i+1) == word.substring(k, k+1)){
                        count++;
                    }
                }
                if(count > 0){
                    Doubloon = true;
                }
        }
        if(Doubloon == true){
            System.out.println(user + " is a Doubloon");
        }
        else{
            System.out.println(user + " is not a Doubloon");
        }

    }
}
*/
import java.util.Scanner;

public class DoubloonWords {

    public static void main(String[] args) {
        // Accept user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String user = scan.nextLine();
        user = user.toLowerCase();
        for (int i = 0; i < user.length(); i++) {
            String a = user.substring(i, i + 1);
                for (int j = 0; j < user.length(); j++) {
                    String b = user.substring(j, j + 1);
                    if (b.equalsIgnoreCase(a)) {
                        count++;
                    }
                }
                if (count != 2) {
                    System.out.println(userInput + " is not a doubloon word.");
                    return;
                }
            }
        }
        System.out.println(userInput + " is a doubloon word!");
}
