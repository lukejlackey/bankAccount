import java.util.ArrayList;
import java.util.Arrays;
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount testAccount = new BankAccount(100.00, 50.00);
        System.out.println(testAccount.getCheckingBalance());
        System.out.println(testAccount.getSavingsBalance());
        System.out.println(testAccount.getTotalAccountFunds());
        System.out.println(testAccount.getAccountNumber());
        System.out.println(testAccount.editFunds("checking",-1000));
        System.out.println(testAccount.editFunds("savings",-1000));
        System.out.println(testAccount.editFunds("checking",100));
        System.out.println(testAccount.editFunds("savings",25));
    }    
}