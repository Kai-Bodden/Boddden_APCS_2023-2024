public class CarAge {
    public static void main(String[]args) {
        ReturningCalculator calc = new ReturningCalculator();
        Car toyota = new Car(2020, 5_000, "Toyota", "Supra", true);
        Car honda = new Car();
        Car hotDog = new Car(2048, 2_000_000, "Franks", "Footlong", true);
        Car ted = new Car(2001, 243_000, "Subaru", "Forester");
        Car octane = new Car(2018, 2_000, "Rocket League", "Octane");
        String ageFirstToyota = ("The " + toyota.manufacturerName + " is ");
        String ageFirstHonda = ("The " + honda.manufacturerName + " is ");
        String ageFirstHotDog = ("The " + hotDog.manufacturerName + " is ");
        String ageFirstTed = ("The " + ted.manufacturerName + " is ");
        String ageFirstOctane = ("The " + octane.manufacturerName + " is ");
        String ageLast = (" years old.");
        int currentYearToyota = toyota.year;
        int currentYearHonda = honda.year;
        int currentYearHotDog = hotDog.year;
        int currentYearTed = ted.year;
        int currentYearOctane = octane.year;

        int currentYear = 2023;
//implemented multiple classes into my code 
        System.out.println(ageFirstToyota + calc.integerSubtractor(currentYear, currentYearToyota) + ageLast);
        System.out.println(ageFirstHonda + calc.integerSubtractor(currentYear, currentYearHonda) + ageLast);
        System.out.println(ageFirstHotDog + calc.integerSubtractor(currentYear, currentYearHotDog) + ageLast);
        System.out.println(ageFirstTed + calc.integerSubtractor(currentYear, currentYearTed) + ageLast);
        System.out.println(ageFirstOctane + calc.integerSubtractor(currentYear, currentYearOctane) + ageLast);
//used almost only variables in my print statement
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/