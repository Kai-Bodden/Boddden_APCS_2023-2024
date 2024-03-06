public class Transaction {
    private String itemName;
    private String itemDesc;
    private double itemCost;
    private double itemSalePrice;
    private double itemProfit;
    private double itemMargin;

    public Transaction(String itemName, String itemDesc, double itemCost, double itemSalePrice, double itemProfit, double itemMargin){
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemCost = itemCost;
        this.itemSalePrice = itemSalePrice;
        this.itemProfit = itemProfit;
        this.itemMargin = itemMargin;
    }
}
