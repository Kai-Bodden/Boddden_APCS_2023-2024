import java.util.Scanner;
public class IsItLegalForYou {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        
        System.out.println("Heres what you can do legally at " + age + " years old:");

        if (age >= 14)
        {
            System.out.println("You can get a job!");
        }
        else if (age < 14)
        {
            System.out.println("You can't get a job.");
        }
        if (age >= 16)
        {
            System.out.println("You can drive.");
        }
        else if (age < 16)
        {
            System.out.println("You cannot drive :/");
        }
         if (age >= 18)
        {
            System.out.println("You can go to a Casino.");
        }
        else if (age < 18)
        {
            System.out.println("You can't go to a Casino.");
        }
        if (age >= 21)
        {
            System.out.println("You can rent a car :)");
        }
        else if (age < 21)
        {
            System.out.println("You cannot rent a car :(");
        }
        if (age >= 21)
        {
            System.out.println("You can buy alcohol.");
        }
        else if (age < 21)
        {
            System.out.println("You cannot buy alcohol.");
        }
        if (age >= 21)
        {
            System.out.println("You can buy cigarettes.");
        }
        else if (age < 21)
        {
            System.out.println("You cannot buy cigarettes.");
        }
        if (age >= 35)
        {
            System.out.println("You can run for president(As long as you have been a citizen for 14 years of your life).");
        }
        else if (age < 35)
        {
            System.out.println("You cannot run for president");
        }
        if (age >= 65)
        {
            System.out.println("You can enroll in Medicare.");
        }
        else if (age < 65)
        {
            System.out.println("You cannot enroll in Medicare.");
        }
    }
    //else if is useful especially for speed. elses skipped if if is true
}
