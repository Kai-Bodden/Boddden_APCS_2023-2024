public class BankData {
    public static String bankName;
    public static double checkingInterestRate;
    public static double savingsInterestRate;

public BankData(){
    bankName = "Wells Fargo";
    checkingInterestRate = 1.8;
    savingsInterestRate = 2.0;
}

public static void printData(){
    System.out.println(bankName + " " + checkingInterestRate + " " + savingsInterestRate);
}

public static void main(String[] args) {
}
}
