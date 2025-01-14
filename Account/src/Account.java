import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0.0;
    private final Date dateCreated;

    public Account(){
        id = 0;
        balance = 0.0;
       dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance=balance;
        dateCreated = new Date();
    }


    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate){
        annualInterestRate = rate/100;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance;
    }

    public void withdraw(double amount){
        if (amount>=balance){
            balance-=amount;
        }
    }

    public String getDateCreated(){
        return String.valueOf(dateCreated);
    }

    public void deposit(double amount){
        if (amount>=0){
            balance+=amount;
        }
    }


    @Override
    public String toString() {
        return "account "+id+" balance "+balance + " date"+ String.valueOf(dateCreated);
    }
}
