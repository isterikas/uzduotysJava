import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {

    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        ArrayList<Double> sorted = new ArrayList<>(history);
        sorted.sort(Double::compareTo);
        return sorted.get(sorted.size() - 1);
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        ArrayList<Double> sorted = new ArrayList<>(history);
        sorted.sort(Double::compareTo);
        return sorted.get(0);
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double entry : history) {
            sum += entry;
        }
        return sum / history.size();
    }

    public String toString() {
        return String.valueOf(history);
    }
}
