import java.util.HashMap;
import java.util.Scanner;

public class ProductStorage {
    private HashMap<String, Product> products = new HashMap<>();


    public boolean takeFromStorage(String name) {
        if (!products.containsKey(name)) {
            System.out.println("Not available");
            return false;
        } else if (products.get(name).getQuantity() == 0) {
            System.out.println("out of stock");
            return false;
        } else {
            System.out.println("You are trying to buy " + name.toUpperCase() + ". You need to pay " + products.get(name).getPrice());
            return true;
        }
    }

    public void addToStorage(Product product) {
        products.put(product.getName().toLowerCase(), product);
    }

    public void storageInfo() {
        for (Product product : products.values()) {
            System.out.println(product.getType().toUpperCase() + " " + product.getName().toUpperCase() + " Quantity : " + product.getQuantity());
        }
    }
    public HashMap<String, Product> getProducts(){
        return products;
    }


}
