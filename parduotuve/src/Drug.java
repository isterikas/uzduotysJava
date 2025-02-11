public class Drug extends Product {
    private final double pvm = 0.09;

    public Drug(String name, double price) {
        super(name, price);
    }


    @Override

    public double getFinalPrice() {
        return super.getNetPrice() + super.getNetPrice() * pvm;
    }
}
