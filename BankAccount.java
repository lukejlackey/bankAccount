import java.util.ArrayList;
import java.util.Arrays;
public class BankAccount {

    public static int numberOfAccounts;
    public static double totalFunds;

    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = (long) Math.floor(Math.random()* 9_000_000_000L);
        numberOfAccounts++;
        totalFunds += checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double getTotalAccountFunds() {
        return this.checkingBalance + this.savingsBalance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String editFunds(String accountType, double funds) {
        String result = "NSF";
        if(accountType == "checking" && (this.checkingBalance + funds) >= 0){
            this.checkingBalance += funds;
            result = "New Checking Balance: " + this.checkingBalance;
        }
        else if(accountType == "savings" && (this.savingsBalance + funds) >= 0){
            this.savingsBalance += funds;
            result = "New Savings Balance: " + this.savingsBalance;
        }
        else return result;
        totalFunds += funds;
        return result;
    }



}