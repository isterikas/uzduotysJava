public class CheckingAcc extends Account {
    private double overdraftLimit;

    public CheckingAcc() {
        super();
        overdraftLimit = 1500;
    }

    public CheckingAcc(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (Math.abs(super.getBalance() - amount) <= overdraftLimit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
