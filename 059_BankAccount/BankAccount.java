public class BankAccount {
    public String userName;
    public String accountType;
    public double currentBalance;
    public double interestRate;
    public boolean isOverdrafted;
    public double balanceChange;

public BankAccount(String bUserName, String bAccountType, double bCurrentBalance, double bInterestRate, boolean bIsOverdrafted){
    userName = bUserName;
    accountType = bAccountType;
    currentBalance = bCurrentBalance;
    interestRate = bInterestRate;
    isOverdrafted = bIsOverdrafted;
}

public static void main(String[] args) {
}

public void checkBalance(){
    System.out.println(currentBalance);
}

public void updateOverdraft(){
    if (currentBalance >= 0){
        boolean isOverdrafted = false;
        System.out.println("The account is not overdrafted.");
    }
    else{
        boolean isOverdrafted = true;
        System.out.println("The account is overdrafted.");
    }
}

public void updateBalance(double balanceChange){
    currentBalance = currentBalance + balanceChange;
}

public void applyInterest(){
    currentBalance = (currentBalance + (currentBalance*interestRate));
}
}
