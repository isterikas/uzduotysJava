import java.text.DecimalFormat;

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
        return "Final price in Euros: " + new DecimalFormat("##.##").format(getFinalPrice()) + ", final price in Swiss Francs: " + new DecimalFormat("##.##").format(getFinalPrice()* 0.94);
    }

    public String toString(){
        return name;
    }
}


