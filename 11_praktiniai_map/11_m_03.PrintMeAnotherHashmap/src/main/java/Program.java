
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        System.out.println(hashMap.values());
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        hashMap.values().forEach(value -> {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        });
    }
}
