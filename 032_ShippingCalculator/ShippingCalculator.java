import java.util.Scanner;
public class ShippingCalculator {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the packages weight:");
        double weight = scan.nextDouble();

        if (weight <= 0)
        {
            System.out.println("Invalid weight, try again.");
        }
        if (weight > 20)
        {
            System.out.println("Too heavy to ship.");
        }
        else if (weight > 0 && weight <= 1)
        {
            System.out.println("This package will cost $3.50.");
        }
        else if (weight > 1 && weight <= 3)
        {
            System.out.println("This package will cost $5.50.");
        }
        else if (weight > 3 && weight <= 10)
        {
            System.out.println("This package will cost $8.50.");
        }
        else if (weight > 10 && weight <= 20)
        {
            System.out.println("This package will cost $10.50.");
        }
    }
}
//the and means both must be true, allowing for more specification 