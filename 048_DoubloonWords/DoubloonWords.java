import java.util.Scanner;
public class DoubloonWords{
    public static void main(String[] args){
        //user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scan.nextLine();
        String user = input.toLowerCase();
       
        for (int i = 0; i < user.length(); i++){
            String a = user.substring(i, i + 1);
            int count = 0;
            //will go through each letter, comparing to the first letter, then will continue
            for (int j = 0; j < user.length(); j++){
                String b = user.substring(j, j + 1);
                if (b.equalsIgnoreCase(a)){
                    count++;
                }
            }
            //Check if the current letter appears twice
            if (count != 2){
                System.out.println(user + " is not a doubloon word.");
                return; //Exit the program if not a doubloon word
            }
        }
        System.out.println(user + " is a doubloon word!");
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/