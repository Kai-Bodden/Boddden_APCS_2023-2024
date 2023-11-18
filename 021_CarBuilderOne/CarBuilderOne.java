import java.util.Scanner ; 
public class CarBuilderOne {
    public static void main (String[]args) { 
        Scanner scan  = new Scanner(System.in);
        int year = 0;
        int mileage = 0;
        String make = "";
        String model = "";
        System.out.println("Hi. Welcome. Please answer these questions to find your perfect car.");
        System.out.println("What year should the car be? ");
        year = scan.nextInt();
        System.out.println("How many miles? ");
        mileage = scan.nextInt();
        System.out.println("What make? ");
        scan.nextLine();
        make = scan.nextLine();
        System.out.println("What model? ");
        model =scan.nextLine();

        Car perfectCar = new Car(year, mileage, make, model);
        System.out.println("I have found your perfect car! ");
        System.out.println("A " + perfectCar.year + " " + perfectCar.manufacturerName + " " + perfectCar.modelName + " , with " + perfectCar.milesDriven + " miles.");
//used scan object to create values for the car object
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/