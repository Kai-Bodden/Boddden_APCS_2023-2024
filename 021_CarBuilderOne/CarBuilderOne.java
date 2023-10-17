import java.util.Scanner ; 
public class CarBuilderOne {
    public static void main (String[]args) { 
        Scanner scan  = new Scanner(System.in);
        double year = 0;
        double mileage = 0;
        String make = "";
        String model = "";
        System.out.println("Hi. Welcome. Please answer these questions to find your perfect car.");
        System.out.println("What year should the car be? ");
        year = scan.nextDouble();
        System.out.println("How many miles? ");
        mileage = scan.nextDouble();
        System.out.println("What make? ");
        scan.nextLine();
        make = scan.nextLine();
        System.out.println("What model? ");
        model =scan.nextLine();

        Car perfectCar = new Car(year, mileage, make, model);
        System.out.println("I have found your perfect car! ");
        System.out.println(perfectCar.year + perfectCar.milesDriven + perfectCar.manufacturerName + perfectCar.modelName);

    

    }
}
