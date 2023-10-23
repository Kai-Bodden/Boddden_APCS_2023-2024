import java.util.Scanner; 
public class CircumferenceAreaOfACircle { 
    public static void main (String[]args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is the radius of your circle? ");
        double radius = scan.nextDouble();
        double perimeter = radius * 2 * Math.PI;
        System.out.println(perimeter);
        //more use of math object

    }
}