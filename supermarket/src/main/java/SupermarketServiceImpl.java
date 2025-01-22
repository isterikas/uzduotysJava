import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SupermarketServiceImpl implements SupermarketService {

    private static CashRegister cashRegister = new CashRegister();
    private static ProductStorage productStorage = new ProductStorage();

    private SupermarketServiceImpl() {

    }

    public static SupermarketServiceImpl getInstance() {
        return new SupermarketServiceImpl();
    }
    public void restock(Product product){
        productStorage.addToStorage(product);
    }

    public void stockInfo(){
        productStorage.storageInfo();
    }
    public void getCashRegister(){
        cashRegister.getRemaining();
    }

    public void sell() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Double, Integer> incomingCoins = new HashMap<>();
        while (true) {
            double paid = 0;
            System.out.println("What would you like to buy? Type in the name of the desired product:");
            String product = String.valueOf(scanner.nextLine()).toLowerCase();
            if (product.isEmpty()) break;
            if (productStorage.takeFromStorage(product)) {
                while (paid < productStorage.getProducts().get(product).getPrice()) {
                    System.out.println("Provide bill or coin (accepted values: 0.1, 0.5, 1, 2)");
                    double value = Double.parseDouble(scanner.nextLine());
                    if (value == 0.1 || value == 0.5 || value == 1.0 || value == 2.0) {
                        paid = Math.round((paid += value) * 100.0) / 100.0;
                        if (incomingCoins.containsKey(value)) {
                            incomingCoins.put(value, incomingCoins.get(value) + 1);
                        } else incomingCoins.put(value, 1);
                        System.out.println("You paid " + paid + " in total.");
                    } else
                        System.out.println("This value is not accepted");
                }
                cashRegister.update(incomingCoins);
                incomingCoins.clear();
               giveChange(productStorage.getProducts().get(product), paid);
                productStorage.getProducts().get(product).setQuantity(productStorage.getProducts().get(product).getQuantity() - 1);
                System.out.println("Here is your product: " + productStorage.getProducts().get(product).getType().toUpperCase() + " " + productStorage.getProducts().get(product).getName().toUpperCase());
            }
        }
    }

    public void giveChange(Product product, double amount) {
        if (amount > product.getPrice()) {
            double toGive = amount - product.getPrice();
            double moneyAvailable = cashRegister.getCash().entrySet().stream()
                    .mapToDouble(entry -> entry.getKey() * entry.getValue()).sum();
            if (toGive > moneyAvailable) System.out.println("Sufficient change cannot be provided");
            else {
                System.out.println("Here is your change:");
                for (Map.Entry<Double, Integer> money : cashRegister.getCash().entrySet()) {
                    if (toGive == 0) break;
                    if (money.getKey() > toGive) continue;
                    int coins = (int) (toGive / money.getKey());
                    toGive = toGive - coins * money.getKey();
                    if (coins > 0) System.out.println("Value " + money.getKey() + ", quantity: " + coins);
                    cashRegister.getCash().put(money.getKey(), money.getValue() - coins);
                }
            }
        }

    }
}

