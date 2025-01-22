import java.util.*;

public class CashRegister {
    private TreeMap<Double, Integer> cash = new TreeMap<>(Comparator.reverseOrder());

    public CashRegister() {
        cash.put(0.5, 20);
        cash.put(1.0, 10);
        cash.put(2.0, 10);
        cash.put(0.1, 50);
    }

    public TreeMap<Double, Integer> getCash(){
        return cash;
    }

    public void addMoney(double value, int count) {
        if (value == 0.1 || value == 0.5 || value == 1.0 || value == 2.0) {
            if (cash.containsKey(value)) {
                cash.put(value, cash.get(value) + count);
            } else cash.put(value, count);
        }
    }

    public void getRemaining() {
        for (Map.Entry<Double, Integer> entry : cash.entrySet()) {
            System.out.println("Value: " + entry.getKey() + ", quantity: " + entry.getValue());
        }
    }



    public void update(HashMap<Double, Integer> incomingCoins) {
        for (Map.Entry<Double, Integer> coin : incomingCoins.entrySet()) {
            cash.put(coin.getKey(), cash.getOrDefault(coin.getKey(), 0) + coin.getValue());
        }
    }
}

