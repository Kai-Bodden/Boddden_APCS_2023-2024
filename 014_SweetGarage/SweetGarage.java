public class SweetGarage {
    public static void main(String[]args) {
        Car toyota = new Car(2020, 5_000, "Toyota", "Supra", true);
        Car honda = new Car();
        Car hotDog = new Car(2048, 2_000_000, "Franks", "Footlong", true);
        Car ted = new Car(2001, 243_000, "Subaru", "Forester");
        Car octane = new Car(2018, 2_000, "Rocket League", "Octane");

        String carOneName = toyota.manufacturerName;
        String carOneModel = toyota.modelName;
        int carOneMiles = toyota.milesDriven;
        int carOneYear = toyota.year;
        String carTwoName = honda.manufacturerName;
        String carTwoModel = honda.modelName;
        int carTwoMiles = honda.milesDriven;
        int carTwoYear = honda.year;
        String carThreeName = hotDog.manufacturerName;
        String carThreeModel = hotDog.modelName;
        int carThreeMiles = hotDog.milesDriven;
        int carThreeYear = hotDog.year;
        String carFourName = ted.manufacturerName;
        String carFourModel = ted.modelName;
        int carFourMiles = ted.milesDriven;
        int carFourYear = ted.year;
        String carFiveName = octane.manufacturerName;
        String carFiveModel = octane.modelName;
        int carFiveMiles = octane.milesDriven;
        int carFiveYear = octane.year;
         


        String templateForCarOne = ("This car is a " + carOneYear + " " + carOneName +" "+ carOneModel + ", and it has " + carOneMiles + " miles.");
        System.out.println("Car 1:");
        System.out.println(templateForCarOne);
        toyota.engageTurbo();
        toyota.revEngine();
        String templateForCarTwo = ("This car is a " + carTwoYear + " " + carTwoName +" "+ carTwoModel + ", and it has " + carTwoMiles + " miles.");
        System.out.println("Car 2:");
        System.out.println(templateForCarTwo);
        honda.revEngine();
        String templateForCarThree = ("This car is a " + carThreeYear + " " + carThreeName +" "+ carThreeModel + ", and it has " + carThreeMiles + " miles." + " This is the Noah Machtmes Footlong Mobile!");
        System.out.println("Car 3:");
        System.out.println(templateForCarThree);
        hotDog.engageTurbo();
        hotDog.revEngine();
        String templateForCarFour = ("This car is a " + carFourYear + " " + carFourName +" "+ carFourModel + ", and it has " + carFourMiles + " miles.");
        System.out.println("Car 4:");
        System.out.println(templateForCarFour);
        ted.revEngine();
        ted.engageTurbo();
        System.out.println("Theo's car caught on fire and exploded :(");
        String templateForCarFive = ("This car is a " + carFiveYear + " " + carFiveName +" "+ carFiveModel + ", and it has " + carFiveMiles + " miles.");
        System.out.println("Car 5:");
        System.out.println(templateForCarFive);
        octane.revEngine();
        
    
        
       
        
    }
}
