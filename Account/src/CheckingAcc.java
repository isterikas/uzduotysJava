public class CheckingAcc extends Account {
    private double overdraftLimit;
    private final String TYPE = "Checking account";

    public CheckingAcc(String name, double overdraftLimit) {
        super(name);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAcc(String name, double overdraftLimit, int id, double balance) {
        super(name, id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (Math.abs(super.getBalance() - amount) <= overdraftLimit) {
            super.withdraw(amount);
        }
    }

    @Override
    public void withdraw(double amount, String description) {
        if (Math.abs(super.getBalance() - amount) <= overdraftLimit && amount > 0) {
            super.withdraw(amount, description);
        }
    }

    @Override
    public String toString() {
        return TYPE + super.toString();
    }
}
