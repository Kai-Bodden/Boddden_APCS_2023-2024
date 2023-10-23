import java.util.Scanner; 
public class CircumferenceAreaOfACircle { 
    public static void main (String[]args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is the radius of your circle? ");
        double radius = scan.nextDouble();
        double perimeter = radius * 2 * Math.PI;
        double area = Math.PI * (Math.pow(radius, 2.0));
        System.out.println("The circumference of the circle is: " + perimeter);
        System.out.println("The are of the circle is: " + area);
        //more use of math object

    }
}