public class GasPriceTracker {
    private String name;
    private double price;

    public GasPriceTracker(String name, double price){
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void incPrice(double amountToInc){
        this.price += amountToInc;
    }

    public void printPrice(){
        System.out.println(name + ":" + price);
    }

    public static void printAllPrice()
   

}
