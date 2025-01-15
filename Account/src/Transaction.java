import java.util.Date;

public class Transaction {
    private final Date date;
    char type;
    double amount;
    double balance;
    String description;

    public Transaction(char type, double amount, double balance, String description){
        date = new Date();
        this.type = type;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
