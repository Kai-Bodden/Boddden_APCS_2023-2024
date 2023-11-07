import java.util.Scanner;
public class PerimeterAreaOfAHexagon {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is the side length of your hexagon? ");
        double sideLength = scan.nextDouble();
        double perimeter = (6 * sideLength);
        double area = (((3 * Math.sqrt(3)) / 2) * Math.pow(sideLength, 2.0));
        System.out.println("The perimeter of your hexagon is: " + perimeter);
        System.out.println("The area of your hexagon is: " + area); 
//math.sqrt helped as well as knowing pemdas
    }    
}
