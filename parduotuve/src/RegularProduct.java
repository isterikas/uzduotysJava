public class RegularProduct extends Product {
    private final double pvm = 0.21;

    public RegularProduct(String name, double price) {
        super(name, price);
    }


    @Override
    public double getFinalPrice() {
        return super.getNetPrice() + super.getNetPrice() * pvm;
    }

}

