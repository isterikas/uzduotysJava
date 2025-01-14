public abstract class Product implements Taxation {
    private String name;
    private double netPrice;

    public Product(String name, double price) {
        this.name = name;
        netPrice = price;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public abstract double getFinalPrice();

    public String printFinalPrice() {
        return "Final price in Euros: " + getFinalPrice() + ", final price in Swiss Francs: " + getFinalPrice() * 0.94;
    }
}


