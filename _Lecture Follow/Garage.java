public class Garage {
    public static void main(String[]args) {
        Car mercedes = new Car(2004, 234_000, "Mercedes", "S430");
        System.out.println(mercedes.manufacturerName);
        System.out.println(mercedes.modelName);
        System.out.println(mercedes.year);
        System.out.println(mercedes.milesDriven + " Miles");
        mercedes.revEngine();
        
    }
}