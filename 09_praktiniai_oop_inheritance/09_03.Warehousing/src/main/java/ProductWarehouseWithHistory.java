import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity) {
        super(productName, capacity);
        addToWarehouse(0.0);
    }

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        addToWarehouse(initialBalance);

    }

    public String history() {
        return String.valueOf(changeHistory);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + String.valueOf(changeHistory));
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        System.out.println(getBalance());
        changeHistory.add(super.getBalance());
        return result;
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
}

