import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.*;

public class ClientBank implements Bank {
    private HashSet<Account> accounts = new HashSet<>();

    public ClientBank() {
    }

    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        if (!accounts.isEmpty()) {
            return accounts.stream().map(Account::getBalance).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
        } else return BigDecimal.ZERO;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accounts.stream().toList();
    }

    @Override
    public Account openDebitAccount(String s) {
        if (!accounts.contains(getAccountByHolderName(s))) {
            ClientAccount account = new DebitAccount(accNumber(), s, BigDecimal.ZERO, this);
            accounts.add(account);
            return account;
        }
        return null;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        if (!accounts.contains(getAccountByHolderName(s))) {
            ClientAccount account = new CreditAccount(accNumber(), s, BigDecimal.ZERO, this, bigDecimal);
            accounts.add(account);
            return account;
        }
        return null;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        for (Account account : accounts) {
            if (account.getHolderName().equals(s))
                return account;
        }
        return null;
    }

    @Override
    public Account getAccountByNumber(String s) {
        for (Account account : accounts) {
            if (account.getNumber().equals(s))
                return account;
        }
        return null;
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    private String accNumber() {
        Random rand = new Random();
        StringBuilder card = new StringBuilder("LT");
        for (int i = 0; i < 14; i++) {
            int n = rand.nextInt(10);
            card.append(Integer.toString(n));
        }
        for (int i = 0; i < 16; i++) {
            if (i % 4 == 0)
                System.out.print(" ");
            System.out.print(card.charAt(i));
        }
        return card.toString();
    }

}
