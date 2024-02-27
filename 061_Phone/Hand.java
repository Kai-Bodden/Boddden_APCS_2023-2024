public class Hand {
    public static void main(String[] args) {
        //creating stuff
        ChargingCable cableOne = new ChargingCable("apple", 6, "USB-C");
        ChargingCable cableTwo = new ChargingCable("apple", 10, "Lightning");
        ChargingCable cableThree = new ChargingCable("anker", 3, "USB Micro");
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone("apple", 13, "mini", "purple", "USB-C", 100);
        Phone phoneThree = new Phone("samsung", 10, "pro");
//calling stuff
        phoneOne.phoneDesc();
        phoneOne.charging(cableOne.getConnectionType());
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/