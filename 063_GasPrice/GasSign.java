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

/*

1/3 - Compile/Content
-Looks pretty good overall, but it wouldn't compile for me.
1/1 - Formatting
1/1 - Comments

*/