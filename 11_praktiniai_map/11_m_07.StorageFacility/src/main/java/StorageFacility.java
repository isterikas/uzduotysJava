import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StorageFacility {
    HashMap<String, ArrayList<String>> unitItems = new HashMap<>();

    public void add(String unit, String item) {
        if (!unitItems.containsKey(unit)) {
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            unitItems.put(unit, items);
        } else {
            unitItems.get(unit).add(item);
        }
    }

    public void remove(String storageUnit, String item) {
        unitItems.get(storageUnit).remove(item);
        if (unitItems.get(storageUnit).isEmpty()) unitItems.remove(storageUnit);
    }

    public ArrayList<String> storageUnits() {
        return (ArrayList<String>) unitItems.entrySet().stream().
                filter(entry -> !entry.getValue().isEmpty())
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public ArrayList<String> contents(String storageUnit) {
        if (unitItems.containsKey(storageUnit)) {
            return unitItems.get(storageUnit);
        } else return new ArrayList<>();
    }
}
