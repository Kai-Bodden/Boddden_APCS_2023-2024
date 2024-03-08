public class TransactionReport {
    private double totalCost = 0;
    private double totalSalePrice = 0;
    private double totalProfit = 0;
    private double totalMargin = 0;

    public void calcTotalCost(Transaction[] arr){
        for (int i = 0; i < arr.length; i++){
            totalCost = totalCost + arr[i].getItemCost(); 
        }
        System.out.println("Total cost of: $" + totalCost);
    }

    public void calcTotalSalePrice(Transaction[] arr){
        for (int i = 0; i < arr.length; i++){
            totalSalePrice = totalSalePrice + arr[i].getItemSalePrice();
        }
        System.out.println("Total sale price of: $" + totalSalePrice);
    }

    public void calcTotalProfit(Transaction[] arr){
        for (int i = 0; i < arr.length; i++){
            totalProfit = totalProfit + arr[i].getItemProfit();
        }
        System.out.println("Total proft of: $" + totalProfit);
    }

    public void calcTotalMargin(Transaction[] arr){
        for (int i = 0; i < arr.length; i++){
            totalMargin = totalMargin + arr[i].getItemMargin();
        }
        System.out.println("Total sale price of: $" + totalMargin);
    }

}
