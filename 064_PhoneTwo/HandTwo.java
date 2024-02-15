public class HandTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /*  ChargingCable cableOne = new ChargingCable("apple", 6, "USB-C");
        ChargingCable cableTwo = new ChargingCable("apple", 10, "Lightning");
        ChargingCable cableThree = new ChargingCable("anker", 3, "USB Micro");*/
        PhoneTwo phoneOne = new PhoneTwo();
        PhoneTwo phoneTwo = new PhoneTwo("apple", 13, "mini", "purple", "USB-C", 100);
        PhoneTwo phoneThree = new PhoneTwo("samsung", 10, "pro");
//calling stuff
        phoneOne.phoneDesc();
        phoneOne.charging(cableOne.getConnectionType());
    }
}
