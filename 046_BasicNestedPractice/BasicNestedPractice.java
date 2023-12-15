import java.util.Scanner;
public class BasicNestedPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What character do you want:");
        String user = scan.nextLine();
        user = user.substring(0,1);
        System.out.println("How many rows, up to 20:");
        int rows = scan.nextInt();
        System.out.println("How mant columns, up to 20:");
        int columns = scan.nextInt();

        if(rows <= 20 && columns <= 20){
            for(int i = 1; i <= rows; i++){
                for(int k = 1; k <= columns; k++){
                    /*this will run util complete, but will reset when the inital 
                    for statement runs again.*/
                    System.out.print(user);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Fix your number of columns and/or rows");
        }
    }    
}
