public class AccountingComputer {
    public static void main(String[] args) {
        //creating both my register and report in the computer
       CashRegister registerOne = new CashRegister();
       TransactionReport report = new TransactionReport();

        //having my report calculate using my transactions, stored in register
       report.calcTotalCost(registerOne.createTransactions());
       report.calcTotalProfit(registerOne.createTransactions());
       report.calcTotalMargin(registerOne.createTransactions());
       report.calcTotalSalePrice(registerOne.createTransactions());
        
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/