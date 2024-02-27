public class Hands {
    public static void main(String[] args) {
        ChargingCable cableOne = new ChargingCable("apple", 6, "USB-C");
        ChargingCable cableTwo = new ChargingCable("apple", 10, "Lightning");
        ChargingCable cableThree = new ChargingCable("anker", 3, "USB Micro");
        
        iPad iPadOne = new iPad(cableOne, 24);

        cableOne.chargerDesc();
        iPadOne.charging(cableOne.getConnectionType());
        cableTwo.chargerDesc();
        iPadOne.charging(cableTwo.getConnectionType());
        cableThree.chargerDesc();
        iPadOne.charging(cableThree.getConnectionType());
        
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/