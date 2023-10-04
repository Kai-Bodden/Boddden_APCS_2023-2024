public class SweetGarage {
    public static void main(String[]args) {
        Car toyota = new Car(2020, 5_000, "Toyota", "Supra", true);
        toyota.engageTurbo();
        toyota.revEngine();
        Car honda = new Car();
        
        honda.engageTurbo();        
        System.out.println(honda.manufacturerName);
        System.out.println(honda.modelName);
        System.out.println(honda.milesDriven);

    }
}
