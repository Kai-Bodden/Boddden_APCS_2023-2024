import java.util.Scanner;

public class PrintYourName {
public static void main (String[]args) {
    Scanner scan  = new Scanner(System.in);
    String firstName = "";
    String lastName = "";
    System.out.println("Please print your first and last name on separate lines below: ");
    firstName = scan.nextLine();
    lastName = scan.nextLine();
    System.out.println("Your first name is: " + firstName);
    System.out.println("Your last name is: " + lastName);
    System.out.println("Your full name is: " + firstName + " " + lastName);
    //learned to use a scanner. User error is easy however with better formatting it can be improved
}
}
    

