import ibank.Account;

import java.math.BigDecimal;

public abstract class ClientAccount implements Account {
    private String accountNumber;
    private String holderName;
    private BigDecimal balance;
    private ClientBank clientBank;

    public ClientAccount(String accountNumber, String holderName, BigDecimal balance, ClientBank clientBank) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.clientBank = clientBank;
    }

    @Override
    public String getNumber() {
        return accountNumber;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal newBalance) {
        balance = newBalance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        } else {
            balance = balance.add(bigDecimal);
            return true;
        }

    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(balance) <= 0) {
            balance = balance.subtract(bigDecimal);
            return true;
        }
        return false;
    }
}
