public class Transaction {
    private String itemName;
    private String itemDesc;
    private double itemCost;
    private double itemSalePrice;
    private double itemProfit;

    public Transaction(String itemName, String itemDesc, double itemCost, double itemSalePrice){
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
    }

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
        double itemMargin = (itemProfit/itemSalePrice) * 100;
        return itemMargin; 
    }

    public String toString(){
        return "This is a " + itemName + " located in the " + itemDesc + " aisle. It has a sale price of $" + itemSalePrice;
    }
}
