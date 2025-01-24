import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
ClientBank swed = new ClientBank();
swed.openDebitAccount("John");
        swed.openDebitAccount("Paul");
        System.out.println(swed.getNumberOfAccounts());

    }
}