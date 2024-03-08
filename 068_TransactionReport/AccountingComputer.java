public class AccountingComputer {
    public static void main(String[] args) {
       CashRegister registerOne = new CashRegister();
       TransactionReport report = new TransactionReport();

       report.calcTotalCost(registerOne.createTransactions());
       report.calcTotalProfit(registerOne.createTransactions());
       report.calcTotalMargin(registerOne.createTransactions());
       report.calcTotalSalePrice(registerOne.createTransactions());
        
    }
}
