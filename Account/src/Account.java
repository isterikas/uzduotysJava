import java.util.ArrayList;
import java.util.Date;

public abstract class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0.0;
    private final Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private final String TYPE = "Account";

    public Account(String name) {
        id = 0;
        balance = 0.0;
        dateCreated = new Date();
        this.name = name;
    }

    public Account(String name, int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate / 100;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount, String description) {
        balance -= amount;
        Transaction transaction = new Transaction('W', amount, balance, description);
        transactions.add(transaction);
    }

    public void withdraw(double amount) {
        balance -= amount;
        Transaction transaction = new Transaction('W', amount, balance, "withdrawal");
        transactions.add(transaction);
    }


    public String getDateCreated() {
        return String.valueOf(dateCreated);
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            Transaction transaction = new Transaction('D', amount, balance, "deposit");
            transactions.add(transaction);
        }
    }

    public void deposit(double amount, String description) {
        if (amount >= 0) {
            balance += amount;
            Transaction transaction = new Transaction('D', amount, balance, description);
            transactions.add(transaction);
        }
    }

    public String getStatement() {
        return "account holder: " + name + '\n' + "annual interest rate: " + annualInterestRate * 100 + "%" + '\n' + "current balance: " + balance + '\n' + "transaction history: " + transactions.toString();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


    @Override
    public String toString() {
        return " of " + name + " id: " + id + " balance " + balance + " created on: " + String.valueOf(dateCreated);
    }
}
