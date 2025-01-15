
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        String result;
        StringBuilder printing = new StringBuilder();

        if (elements.size() == 1) {
            result = " element";
            for (String element : elements) {
                printing.append(element);
            }

        } else {
            result = " elements";
            for (String element : elements) {
                printing.append(element).append('\n');
            }
        }

        return "The collection " + name + " has " + elements.size() + result + ":" + '\n' + printing;
    }
}
