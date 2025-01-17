import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        } else return false;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        registry.keySet()
                .forEach(System.out::println);
    }

    public void printOwners() {
        registry.values().stream()
                .distinct().forEach(System.out::println);
    }
}
