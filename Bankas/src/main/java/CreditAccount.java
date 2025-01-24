import ibank.Account;

import java.math.BigDecimal;

public class CreditAccount extends ClientAccount {
    private BigDecimal creditLimit;

    public CreditAccount(String accountNumber, String holderName, BigDecimal balance, ClientBank clientBank, BigDecimal creditLimit) {
        super(accountNumber, holderName, balance, clientBank);
        this.creditLimit = creditLimit;
    }

    public boolean withdraw(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(creditLimit) <= 0) {
            super.setBalance(super.getBalance().subtract(bigDecimal));
            return true;
        }
        return false;
    }
}
