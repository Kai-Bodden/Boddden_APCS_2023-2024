public class BankData {
    public static String bankName;
    public static double checkingInterestRate;
    public static double savingsInterestRate;

public BankData(String bBankName, double bCheckingInterestRate, double bSavingsInterestRate){
    bankName = bBankName;
    checkingInterestRate = bCheckingInterestRate;
    savingsInterestRate = bSavingsInterestRate;
}

public static void printData(){
    System.out.println(bankName + " " + checkingInterestRate + " " + savingsInterestRate);
}

}
