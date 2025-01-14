import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double capacity) {
        this.capacity = capacity;
    }

    public void add(Packable packable) {
        double sum = 0.0;
        for (Packable item : items) {
            sum += item.weight();
        }
        if (sum + packable.weight() < capacity) {
            items.add(packable);
        }
    }

    @Override
    public double weight() {
        double sum = 0.0;
        for (Packable item : items) {
            sum += item.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
