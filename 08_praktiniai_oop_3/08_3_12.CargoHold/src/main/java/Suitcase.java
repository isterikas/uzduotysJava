import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Item itemm : items) {
            totalWeight += itemm.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (totalWeight()+ item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) return "no items (0 kg)";
        String result = " item (";
        if (items.size()>1) result = " items (";
        return items.size()+result+totalWeight()+" kg)";
    }
    public void printItems(){
        for (Item item:items){
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item heaviest = new Item("A", 0);
        int weight = 0;
        for (Item item:items) {
            heaviest = item.getWeight() > weight ? item : heaviest;
            weight = Math.max(item.getWeight(), weight);
        }
        return heaviest;
    }
}
