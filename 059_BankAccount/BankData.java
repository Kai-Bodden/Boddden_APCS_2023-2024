public class BankData {
    public static String bankName;
    public static double checkingInterestRate;
    public static double savingsInterestRate;

public BankData(){
    bankName = "Wells Fargo";
    checkingInterestRate = 1.8;
    savingsInterestRate = 2.0;
}
//how a user would check the data, static since changes would need to be system wide
public static void printData(){
    System.out.println(bankName + " " + checkingInterestRate + " " + savingsInterestRate);
}

public static void main(String[] args) {
}
}
