import java.util.Scanner;
public class DistanceAcrossEarth {
    public static void main (String[]args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("You first need to enter the latitude and longitude of your first coordinate.");
        System.out.println("Please enter your first latitude coordinate: ");
        double firstLatitude = scan.nextDouble();
        System.out.println("Please enter your first longitude coordinate: ");
        double firstLongitude = scan.nextDouble();
        System.out.println("Now, please enter the latitude and longitude of your second coordinate.");
        System.out.println("Please enter your second latitude coordinate: ");
        double secondLatitude = scan.nextDouble();
        System.out.println("Please enter your second longitude coordinate: ");
        double secondLongitude = scan.nextDouble();

        double latOneMinLatTwo = (firstLatitude - secondLatitude);
        double lngOneMinLngTwo = (firstLongitude - secondLongitude);
        double latOnePlusLatTwo = (firstLatitude + secondLatitude);

        double yEquation = (12430 * (Math.abs(latOneMinLatTwo) / 360));
        double xEquation = (24901 * (Math.abs(lngOneMinLngTwo) / 360)) * (Math.cos(latOnePlusLatTwo / 2));
        double distance = Math.sqrt((2 * Math.pow(xEquation, 2.0)) + (2 * Math.pow(yEquation, 2.0)));
        double distanceKm = 1.609 * distance ; 
        System.out.println("The distance between these coordinates is: " + distanceKm + "km");
//haversine formula, using math object for cos and absolute value, learned how coordinates work 





    }
}