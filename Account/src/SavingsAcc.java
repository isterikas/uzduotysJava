public class SavingsAcc extends Account {
    private final String TYPE = "Savings account";

    public SavingsAcc(String name) {
        super(name);
    }

    public SavingsAcc(String name, int id, double balance) {
        super(name, id, balance);
    }

    @Override
    public void withdraw(double amount, String description) {
        if (amount <= super.getBalance()) {
            super.withdraw(amount, description);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= super.getBalance() && amount>0) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return TYPE + super.toString();
    }
}
