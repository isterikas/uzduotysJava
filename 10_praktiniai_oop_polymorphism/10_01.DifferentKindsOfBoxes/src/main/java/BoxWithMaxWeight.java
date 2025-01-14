import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public BoxWithMaxWeight(int capacity) {
        super();
        maxWeight = capacity;
    }


    @Override
    public void add(Item item) {
        int sum = 0;
        for (Item itemm : items) {
            sum += itemm.getWeight();
        }
        if (sum < maxWeight || item.getWeight() == 0) {
            items.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item itemm : items) {
            if (itemm.hashCode() == item.hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BoxWithMaxWeight{" +
                "items=" + items +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
