public class GasSign {
        GasPriceTracker unleaded = new GasPriceTracker("Unleaded", 3.45);
        GasPriceTracker plus = new GasPriceTracker("Plus", 3.60);
        GasPriceTracker premium = new GasPriceTracker("Premium", 4.00);
    public static void main(String[] args) {
        GasSign gasSign = new GasSign();
        gasSign.printAllPrices();

        unleaded.setPrice(unleaded.getPrice + 0.1);
        
    }
    public void printAllPrices(){
        System.out.println(unleaded.getName() + ": " + unleaded.getPrice());
        System.out.println(plus.getName() + ": " + plus.getPrice());
        System.out.println(premium.getName() + ": " + premium.getPrice());
    }
}
