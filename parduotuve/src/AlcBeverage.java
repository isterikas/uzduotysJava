public class AlcBeverage extends Product {
    private final double pvm = 0.21;
    private double percentage;
    private double tax;
    private double volume;

    public AlcBeverage(String name, double price, double percentage, double volume) {
        super(name, price);
        if (percentage <= 15) {
            tax = 0.89;
        } else {
            tax = 1.26;
        }

    }

    public double getFinalPrice() {
        return super.getNetPrice() + super.getNetPrice() * pvm + volume * tax;
    }
}
