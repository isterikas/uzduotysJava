import java.util.ArrayList;
import java.util.Date;

public class Account {
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

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "withdrawal"));
        }
    }

    public void withdraw(double amount, String description) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, description));
           ;
        }
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

    public String getStatement(){
        return transactions.toString();
    }


    @Override
    public String toString() {
        return TYPE + " of " + name + " id: " + id + " balance " + balance + " created on: " + String.valueOf(dateCreated);
    }
}
