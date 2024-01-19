import java.util.Scanner;
public class DateTranslator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get date
        System.out.print("Enter the day: ");
        int day = scan.nextInt();
        System.out.print("Enter the month: ");
        int month = scan.nextInt();
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        //choose format
        System.out.println("Pick date format:");
        System.out.println("1: American (MM/DD/YY)");
        System.out.println("2: European (DD/MM/YY)");
        System.out.print("Enter choice of either 1 or 2");
        int choice = scan.nextInt();
        if (choice == 1) {
            printAmerican(month, day, year);
        } else if (choice == 2) {
            printEuropean(day, month, year);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
    //america custom method
    public static void printAmerican(int month, int day, int year) {
        System.out.println("American format: " + month + "/" + day + "/" + year);
    }
    //european custom method
    public static void printEuropean(int day, int month, int year) {
        System.out.println("European format: " + day + "/" + month + "/" + year);
    }
}
//the user is essentially picking which custom method will be printed through the if statement

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/