import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> movables = new ArrayList<>();

    public void addToHerd(Movable movable) {
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : movables) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movable movable : movables) {
            result.append(movable.toString()).append('\n');
        }
        return String.valueOf(result);
    }
}
