public class Wine extends AlcBeverage {
    private double tax;

    public Wine(String name, double price, double percentage, double volume) {
        super(name, price, percentage, volume);
        if (percentage <= 8.5) {
            tax = 0.28;
        } else {
            tax = 0.72;
        }
    }
}
