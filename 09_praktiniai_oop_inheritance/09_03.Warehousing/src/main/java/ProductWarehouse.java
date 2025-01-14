import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return getName() + ": balance = " + super.getBalance() + ", space left " + (super.getCapacity() - super.getBalance());
    }
}
