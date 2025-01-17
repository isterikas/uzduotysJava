import java.util.HashMap;
import java.util.Map;

public class IOU {
    private HashMap<String, Double> howMuch = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        howMuch.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return howMuch.entrySet().stream().filter(entry -> entry.getKey().equals(toWhom)).mapToDouble(Map.Entry::getValue).sum();

    }
}
