public class CashRegister {
    public Transaction[] createTransactions(){
    //creating transactions using constructor
    Transaction transaction1 = new Transaction("Xbox", "Technology", 203.5, 500);
    Transaction transaction2 = new Transaction("Cereal", "Food", 1.43, 7.25);
    Transaction transaction3 = new Transaction("T-Shirt", "Clothing", 0.45, 3.26);

    //putting my transactions into an array 
    Transaction[] totalTransactions = {transaction1, transaction2, transaction3};
    return totalTransactions;
    }
}
