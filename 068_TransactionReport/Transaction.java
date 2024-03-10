public class Transaction {
    //variables
    private String itemName;
    private String itemDesc;
    private double itemCost;
    private double itemSalePrice;
    private double itemProfit;

    //transaction constructor
    public Transaction(String itemName, String itemDesc, double itemCost, double itemSalePrice){
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
    }

    //getters
    public String getItemName(){
        return itemName;
    }
    public String getItemDesc(){
        return itemDesc;
    }
    public double getItemCost(){
        return itemCost;
    }
    public double getItemSalePrice(){
        return itemSalePrice;
    }

    public double getItemProfit(){
        double itemProfit = itemSalePrice - itemCost;
        return itemProfit;
    }
    public double getItemMargin(){
        double itemProfit = getItemProfit();
        double itemMargin = (itemProfit/itemCost) * 100;
        return itemMargin; 
    }

    //to string if needed
    public String toString(){
        return "This is a " + itemName + " located in the " + itemDesc + " aisle. It has a sale price of $" + itemSalePrice;
    }
}
