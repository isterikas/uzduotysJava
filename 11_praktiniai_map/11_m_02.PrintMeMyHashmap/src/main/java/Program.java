
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashMap) {
        hashMap.keySet().forEach(System.out::println);
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.keySet().stream().filter(key -> key.contains(text)).forEach(System.out::println);
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String text) {
        hashMap.entrySet().forEach((entry -> {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }));


    }
}