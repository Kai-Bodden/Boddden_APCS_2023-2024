import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[]args) {
        Scanner scan  = new Scanner(System.in);
        double principleBalance = 0 ;
        double annualInterestRate = 0 ;
        double remainingMonths =  0 ;
        System.out.println("Please print your principle balance here: ");
        principleBalance = scan.nextDouble();
        System.out.println("Please print your annual interest rate here: ");
        annualInterestRate = scan.nextDouble();
        System.out.println("Please print your remaining months here: ");
        remainingMonths = scan.nextDouble();

        double monthlyInterest = (principleBalance * (annualInterestRate/remainingMonths));
        System.out.println("Your monthly interest is: " + monthlyInterest);
        double monthlyPayment = principleBalance/remainingMonths + monthlyInterest ;
        System.out.println("Your monthly payment is: " + monthlyPayment);

        //the system will print one line at a time when i tell it to scan after a print. 
    }
    
}
