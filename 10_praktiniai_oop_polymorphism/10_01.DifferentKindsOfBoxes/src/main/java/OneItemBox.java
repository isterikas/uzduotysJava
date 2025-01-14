import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        if (items.isEmpty()) {
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

    public OneItemBox() {

    }

    @Override
    public String toString() {
        return "OneItemBox{" +
                "items=" + items +
                '}';
    }
}
