public class SavingsAcc extends Account {
    private final String TYPE = "Savings account";
    public SavingsAcc(String name){
        super(name);
    }
    @Override
    public String toString() {
        return TYPE + super.toString();
    }
}
