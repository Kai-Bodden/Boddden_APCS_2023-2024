public class GasSign {
    public static void main(String[] args) {
        GasPriceTracker unleaded = new GasPriceTracker("Unleaded", 3.45);
        GasPriceTracker plus = new GasPriceTracker("Plus", 3.60);
        GasPriceTracker premium = new GasPriceTracker("Premium", 4.00);
        
        printGasPrice(unleaded, plus, premium);

        increaseGasPrice(unleaded, 0.5);
        increaseGasPrice(plus, 0.5);
        increaseGasPrice(premiu)
    }
    
}
