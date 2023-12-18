import java.util.Scanner;
public class AbecedarianWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("is the word Abecedarin?:");
        String word = scan.nextLine();

        boolean Abecedarian = true;

        for (int i = 0; i < word.length()-1; i++){
            int compare = word.substring(i, i+1).compareToIgnoreCase(word.substring(i+1, i+2));

            if (compare <= 0){

            }
            else{
                Abecedarian = false;
            }
        }
        
        if(Abecedarian == true){
            System.out.println("the word is Abecedarian");
        }
        else{
            System.out.println("The word is not Abecedarian");
        }
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/