public class UserAccount {
    public static void main(String[] args) {
        BankData userData = new BankData();
        BankAccount user = new BankAccount("Kai Bodden", "checking", 100, 2.5, false);
        

        user.checkBalance();
        user.updateBalance(50);
        user.checkBalance();
        user.updateOverdraft();
        user.updateBalance(-90);
        user.checkBalance();
    }
}
