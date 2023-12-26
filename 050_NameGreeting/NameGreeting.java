import java.util.Scanner;
public class NameGreeting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get name
        System.out.print("Enter your name: ");
        String userName = scan.nextLine();
        // Call greet method
        greet(userName);
    }

    //greet method with set string to output
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
//in this case, the custom method is a mold that uses the input to create a funal output
